package menu;

import paymentsystem.BankAccount;
import paymentsystem.Merchant;
import paymentsystem.MerchantService;
import paymentsystem.StatusAccount;
import paymentsystem.exceptions.BankAccountNotFoundException;
import paymentsystem.exceptions.MerchantNotFoundException;
import paymentsystem.exceptions.NoBankAccountsFoundException;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Menu {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Merchant> merchants = new ArrayList<>();
        MerchantService merchantService = new MerchantService(merchants);
        boolean input = false;

        System.out.println("""
                Выберите необходимый пункт меню:
                1 - получение информации о банковский аккаунтах мерчанта;
                2 - добавление нового банковского аккаунта мерчанту;
                3 - редактирование банковского аккаунта мерчента;
                4 - удаление банковского аккаунта мерчанта;
                5 - получение информации о мерчанте по id;
                6 - получение всех мерчантов, зарегистрированных в платежной системе;
                7 - создание мерчанта;
                8 - удаление мерчанта;
                0 - выход;
                """);

        while (!input) {
            System.out.print("Введите число: ");

            switch (scanner.nextLine()) {

                case "1" -> {
                    System.out.print("Введите id мерчента, для которого необходимо предоставить банковские аккаунт: ");
                    String idScanner = scanner.nextLine();
                    try {
                        Merchant merchant = merchantService.getMerchantById(idScanner);
                        List<BankAccount> listBank = merchantService.getMerchantBankAccounts(merchant);
                        listBank.forEach(s -> System.out.printf("Аккаунт: номер - %s; status - %s; дата - %s\n", s.getAccountNumber(), s.getStatus(), s.getCreatedAt()));
                    } catch (MerchantNotFoundException | NoBankAccountsFoundException e) {
                        System.out.println(e.getMessage());
                    }
                }

                case "2" -> {
                    try {
                        System.out.print("Введите id мерчента, которому необходимо добавить банковский аккаунт: ");
                        String idScanner = scanner.nextLine();
                        Merchant merchant = merchantService.getMerchantById(idScanner);
                        System.out.print("Введите номер банковского аккаунта мерчента: ");
                        String idScannerAccount = scanner.nextLine();
                        BankAccount bankAccount = new BankAccount(idScanner, StatusAccount.ACTIVE, idScannerAccount, LocalDateTime.now());
                        merchantService.addBankAccount(merchant, bankAccount);
                    } catch (MerchantNotFoundException | IOException | NoBankAccountsFoundException e) {
                        System.out.println(e.getMessage());
                    }
                }

                case "3" -> {
                    System.out.print("Введите id мерчента, у которого редактируется аккаунт: ");
                    String idScanner = scanner.nextLine();
                    try {
                        Merchant merchant = merchantService.getMerchantById(idScanner);
                        System.out.print("Введите номер аккаунта, которое редактируется: ");
                        String idScannerAccount = scanner.nextLine();
                        System.out.print("Введите новый номер аккаунта: ");
                        String newIdScannerAccount = scanner.nextLine();
                        BankAccount tempBankAccount = new BankAccount(merchant.getId(), StatusAccount.ACTIVE, idScannerAccount, LocalDateTime.now());
                        merchantService.updateBankAccount(tempBankAccount, newIdScannerAccount);
                    } catch (NoBankAccountsFoundException | MerchantNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                }


                case "4" -> {
                    System.out.print("Введите id мерчента, о которого надо удалить аккаунт: ");
                    String idScanner = scanner.nextLine();
                    try {
                        Merchant merchant = merchantService.getMerchantById(idScanner);
                        List<BankAccount> listAccounts = merchantService.getMerchantBankAccounts(merchant);
                        System.out.print("Введите номер аккаунта, который надо удалить: ");
                        String idScannerDelete = scanner.nextLine();
                        BankAccount bankAccount = listAccounts.stream().filter(a -> a.getAccountNumber().equals(idScannerDelete)).findFirst().get();
                        if (merchantService.deleteBankAccount(bankAccount)) {
                            System.out.println("Аккаунт " + idScannerDelete + " успешно удален!");
                        }
                    } catch (MerchantNotFoundException | NoBankAccountsFoundException |
                             BankAccountNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                }

                case "5" -> {
                    try {
                        System.out.print("Введите id мерчента, о котором надо получить информацию: ");
                        String idScanner = scanner.nextLine();
                        Merchant merchant = merchantService.getMerchantById(idScanner);
                        System.out.printf("Мерчант: ID - %s; имя - %s; дата создания - %s\n", merchant.getId(), merchant.getName(), merchant.getCreatedAt());
                    } catch (MerchantNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                }

                case "6" -> merchantService.getMerchants().forEach(s ->
                        System.out.printf("Мерчант: ID - %s; имя - %s; дата создания - %s\n", s.getId(), s.getName(), s.getCreatedAt()));

                case "7" -> {
                    System.out.print("Введите название мерчанта: ");
                    String nameMerchantScanner = scanner.nextLine();
                    String id = String.valueOf(UUID.randomUUID());
                    LocalDateTime createdAt = LocalDateTime.now();
                    Merchant merchant = new Merchant(id, nameMerchantScanner, createdAt);
                    merchantService.createMerchant(merchant);
                }

                case "8" -> {
                    System.out.print("Введите id мерчента, которое хотите удалить: ");
                    String idDelete = scanner.nextLine();
                    try {
                        if (merchantService.deletedMerchant(idDelete)) {
                            System.out.println("Мерчент с id - " + idDelete + " успешно удален!");
                        }
                    } catch (MerchantNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case "0" -> input = true;
            }
        }
    }
}