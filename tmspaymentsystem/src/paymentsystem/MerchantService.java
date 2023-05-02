package paymentsystem;

import paymentsystem.exceptions.BankAccountNotFoundException;
import paymentsystem.exceptions.MerchantNotFoundException;
import paymentsystem.exceptions.NoBankAccountsFoundException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MerchantService implements FilesPathes {

    private final Path fileAccount = Paths.get(FILE_BANK_ACCOUNT);
    private final Path fileMerchant = Paths.get(FILE_MERCHANT);
    private final List<Merchant> merchants; // список мерчантов
    private boolean temp;

    public MerchantService(List<Merchant> merchants) {
        this.merchants = merchants;
    }

    // добавление нового банковского аккаунта мерчанту (2)
    public void addBankAccount(Merchant merchant, BankAccount bankAccount) throws IOException, NoBankAccountsFoundException {
        if (Stream.of(bankAccount).anyMatch(s -> bankAccount.getAccountNumber().length() != 8 && bankAccount.getAccountNumber().matches("^\\d+"))) {
            throw new NoBankAccountsFoundException("Номер банковского аккаунта введен некорректно");
        }
        BankAccount tempBankAccount = merchant.getBankAccounts().stream().filter
                (s -> s.getAccountNumber().equals(bankAccount.getAccountNumber())).findFirst().orElse(null);
        if (tempBankAccount != null) {
            if (tempBankAccount.getStatus() == StatusAccount.DELETED) {
                tempBankAccount.setStatus(StatusAccount.ACTIVE);
            }
        } else {
            merchant.setBankAccount(bankAccount);

            Files.write(fileAccount, (merchant.getId() + " "
                    + bankAccount.getStatus() + " " + bankAccount.getAccountNumber() + " "
                    + bankAccount.getCreatedAt() + "\n").getBytes(), StandardOpenOption.APPEND);
        }
    }

    public List<BankAccount> getMerchantBankAccounts(Merchant merchant) throws NoBankAccountsFoundException { // получение информации о банковских аккаунтах мерчента (1)
        if (merchant.getBankAccounts().size() != 0) {
            return merchant.getBankAccounts().stream().
                    sorted(Comparator.comparing(BankAccount::getCreatedAt).
                            thenComparing(BankAccount::getStatus)).collect(Collectors.toList());
        } else {
            throw new NoBankAccountsFoundException("Аккаунты для мерчанта " + merchant.getId() + " отсутствуют!");
        }
    }

    public BankAccount updateBankAccount(BankAccount bankAccount, String number) throws NoBankAccountsFoundException { // редактирование банковского аккаунта мерчанта (3)
        merchants.forEach(merchant -> {
            BankAccount existing = merchant.getBankAccounts().stream().filter(a -> a.getAccountNumber().equals(bankAccount.getAccountNumber())).findFirst().
                    orElseThrow(() -> throw new NoBankAccountsFoundException("Банковский аккаунт не найден"));
            existing.setAccountNumber(number);
        });
        try {
            List<String> listExisting = Files.readAllLines(fileAccount);
            List<String> newListExisting = new ArrayList<>();
            for (String s : listExisting) {
                if (s.contains(bankAccount.getAccountNumber())) {
                    String newString = s.replace(bankAccount.getAccountNumber(), number);
                    newListExisting.add(newString);
                } else {
                    newListExisting.add(s);
                }
            }
            Files.delete(fileAccount);
            Path newFile = Files.createFile(fileAccount);
            Files.write(newFile, newListExisting);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return bankAccount;
    }

    public boolean deleteBankAccount(BankAccount bankAccount) throws BankAccountNotFoundException { // удаление банковского аккаунта мерчанта (4)
        Merchant merchant = merchants.stream().filter(s -> s.getId().equals(bankAccount.getMerchantId())).findFirst().get();
        try {
            List<String> listExisting = Files.readAllLines(fileAccount);
            List<String> newListExisting = listExisting.stream().filter(line -> !line.contains(bankAccount.getAccountNumber())).toList();
            if (!merchant.getBankAccounts().remove(bankAccount)) {
                throw new BankAccountNotFoundException("Банковский аккаунт не был удален");
            }
            Files.delete(fileAccount);
            Path newFile = Files.createFile(fileAccount);
            Files.write(newFile, newListExisting);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return true;
    }

    public void createMerchant(Merchant merchant) { //создание мерчанта (7)
        merchants.add(merchant);
        try {
            Files.write(fileMerchant, (merchant.getId() + " " + merchant.getName() + " "
                    + merchant.getCreatedAt() + " " + "\n").getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Merchant> getMerchants() { //возвращает всех мерчентов (6)
        return merchants;
    }

    public Merchant getMerchantById(String idScanner) throws MerchantNotFoundException { // получение информации о мерчанте по id (5)
        return merchants.stream().filter(s -> s.getId().equals(idScanner)).findFirst().orElseThrow(() ->
                new MerchantNotFoundException("Мерчант с id - " + idScanner + " отсутствует!"));
    }

    public boolean deletedMerchant(String idScanner) throws MerchantNotFoundException { // удаление мерчента (8)
        Merchant merchant = merchants.stream().filter(s -> s.getId().toString().equals(idScanner)).findFirst().orElseThrow(() ->
                new MerchantNotFoundException("Мерчант с id - " + idScanner + " отсутствует!"));
        try {
            List<String> listAccount = Files.readAllLines(fileAccount);
            List<String> listMerchant = Files.readAllLines(fileMerchant);
            List<String> newListAccount = listAccount.stream().filter(line -> !line.contains(idScanner)).toList();
            List<String> newListMerchant = listMerchant.stream().filter(line -> !line.contains(idScanner)).toList();
            if (!merchants.remove(merchant)) {
                throw new MerchantNotFoundException("Мерчант с id - " + idScanner + " не был удален");
            }
            Files.delete(fileMerchant);
            Files.delete(fileAccount);
            Path newFileAccount = Files.createFile(fileAccount);
            Path newFileMerchant = Files.createFile(fileMerchant);
            Files.write(newFileAccount, newListAccount);
            Files.write(newFileMerchant, newListMerchant);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return merchants.remove(merchant);
    }
}
