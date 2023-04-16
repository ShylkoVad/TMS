package by.teachmeskils.homeworks.hw_14042023.shop;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class RegistrationUtils {
    public static String name;
    public static String date;
    public static String phone;
    public static String gender;
    public static String exit;

    private static Scanner stringInput = new Scanner(System.in);

    public static final String FILE_USERS = "f:\\JAVA\\TMS\\Tasks\\hw_14042023\\users.txt";

    public static void readUserData() { // считывание данных о пользователи из консоли
        System.out.print("Введите ФИО покупателя: ");
        name = stringInput.nextLine();
        System.out.print("Введите Ваш пол (мужской/женский): ");
        gender = stringInput.nextLine();
        System.out.print("Введите дату рождения покупателя (yyyy-MM-dd): ");
        date = stringInput.nextLine();
        System.out.print("Введите номер телефона покупателя: ");
        phone = stringInput.nextLine();
    }

    public static boolean isValidDate() {
        date = date.trim();
        try {
            LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            return true;
        } catch (DateTimeParseException e) {
            System.out.println("Введена некорректно дата рождения покупателя");
            return false;
        }
    }

    public static boolean isValidName() {
        name = name.trim();
        if (!name.isEmpty() && name.matches("[а-яА-ЯёЁ\\s]*")) {
            return true;
        } else {
            System.out.println("Введено не корректно ФИО покупателя");
            return false;
        }
    }

    public static boolean isValidGender() {
        gender = gender.trim();
        if (gender.equals("мужской") || gender.equals("женский")) {
            return true;
        } else {
            System.out.println("Введен не корректно пол покупателя");
            return false;
        }
    }

    public static boolean isValidPhone() {
        phone = phone.trim();
        if (phone.startsWith("+37529") || phone.startsWith("+37525") || phone.startsWith("+37544") || phone.startsWith("+37533")) {
            if (phone.length() == 13 && phone.matches("[+]\\d+")) {
                return true;
            } else {
                System.out.println("Введен не корректно номер покупателя");
                return false;
            }
        }
        return false;
    }

    public static void createUserFile() { // создание файла и запись в него
        File fileUsers = new File(FILE_USERS);
        try (BufferedWriter bufUsers = new BufferedWriter(new FileWriter(fileUsers))) {
            do {
                System.out.print("Ввести нового покупателя? (да/нет): ");
                exit = stringInput.nextLine();
                if (exit.equals("да")) {
                    readUserData();
                    System.out.println();
                    if (isValidName() && isValidDate() && isValidGender() && isValidPhone()) {
                        bufUsers.write(name + "; ");
                        bufUsers.write(gender + "; ");
                        bufUsers.write(date + "; ");
                        bufUsers.write(phone + "; ");
                        bufUsers.write("\n");
                    } else {
                        System.out.println("Введите повторно данные о покупателе " + name);
                        System.out.println();
                    }
                }
            } while (!exit.equals("нет"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}