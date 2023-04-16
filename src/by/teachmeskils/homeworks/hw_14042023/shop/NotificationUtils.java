package by.teachmeskils.homeworks.hw_14042023.shop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class NotificationUtils {
    public static void sendNotification(String filePath) throws IOException {

        String nameShop = "\"Мир одежды\"";
        RegistrationUtils.createUserFile();

        LocalDate today = LocalDate.now();

        File fileUsers = new File(filePath);

        String user;
        String productList = "весеннего ассортимента";
        try (BufferedReader bufUsers = new BufferedReader(new FileReader(fileUsers))) {

            while ((user = bufUsers.readLine()) != null) {
                String[] userArray = user.split(";");

                Map<String, String> users = new HashMap<>();
                for (int i = 0; i < userArray.length; i++) {
                    switch (i) {
                        case 0 -> users.put("name", userArray[i]);
                        case 2 -> users.put("date", userArray[i]);
                    }
                }

                LocalDate dateBirth = LocalDate.parse(users.get(("date")).trim()); // преобразование даты
                dateBirth = dateBirth.plusYears(today.getYear() - dateBirth.getYear());
                LocalDate dateStartDiscount = dateBirth.minusWeeks(1);
                LocalDate dateEndDiscount = dateBirth.plusWeeks(1);

                LocalDate dateSpringSale = LocalDate.parse("2023-05-01");
                dateSpringSale = dateSpringSale.plusYears(today.getYear() - dateSpringSale.getYear());
                LocalDate dateSummerSale = LocalDate.parse("2023-09-01");
                dateSummerSale = dateSummerSale.plusYears(today.getYear() - dateSummerSale.getYear());
                LocalDate dateAutumnSale = LocalDate.parse("2023-11-01");
                dateAutumnSale = dateAutumnSale.plusYears(today.getYear() - dateAutumnSale.getYear());
                LocalDate dateWinterSale = LocalDate.parse("2023-02-01");
                dateWinterSale = dateWinterSale.plusYears(today.getYear() - dateWinterSale.getYear());

                if (today.isAfter(dateSpringSale) && today.isBefore(dateSummerSale)) {
                    productList = "летнего ассортимента";
                }
                if (today.isAfter(dateSummerSale) && today.isBefore(dateAutumnSale)) {
                    productList = "осеннего ассортимента";
                }
                if (today.isAfter(dateAutumnSale) && today.isBefore(dateWinterSale)) {
                    productList = "зимнего ассортимента";
                }

                if (today.isEqual(dateBirth)) {
                    System.out.printf("""
                            Уважаемый(-моя) %s Магазин %s поздравляет Вас с Днем рождения и дарит Вам в скидку 15%% на следующие товары %s.
                            Скидка действует с %4$td %4$tB %4$tY до %5$td %5$tB %5$tY.
                            Будем рады видеть Вас в нашем магазине
                            """, users.get("name").trim(), nameShop, productList, dateStartDiscount, dateEndDiscount);
                } else if (today.isEqual(dateBirth.minusWeeks(1))) {
                    System.out.printf("""
                            Уважаемый(-моя) %s, магазин %s в Ваш День рождения дарит Вам в скидку 15%% на следующие товары %s.
                            Скидка действует с %4$td %4$tB %4$tY до %5$td %5$tB %5$tY.
                            Будем рады видеть Вас в нашем магазине
                            """, users.get("name").trim(), nameShop, productList, dateStartDiscount, dateEndDiscount);
                } else if (today.isEqual(dateBirth.plusDays(6))) {
                    System.out.printf("""
                            Уважаемый(-моя) %s Магазин %s напоминает Вам про скидку 15%% на следующие товары %s.
                            Скидка действует с %4$td %4$tB %4$tY до %5$td %5$tB %5$tY.
                            Будем рады видеть Вас в нашем магазине
                            """, users.get("name").trim(), nameShop, productList, dateStartDiscount, dateEndDiscount);
                }
            }
        }
    }
}
