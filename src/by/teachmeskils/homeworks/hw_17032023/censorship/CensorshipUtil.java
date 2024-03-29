package by.teachmeskils.homeworks.hw_17032023.censorship;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CensorshipUtil {
    private static String strOriginal;
    private static String strBlackList;
    private static int quantity = 0;

    private CensorshipUtil() {
    }

    public static void checkTextCensorship(String firstFilePath, String secondFilePath) {
        try (BufferedReader bfrBlackList = new BufferedReader(new FileReader(secondFilePath));) {

            while ((strBlackList = bfrBlackList.readLine()) != null) {
                String[] arrayBlackList = strBlackList.split("\r\n");
                BufferedReader bfrOriginal = new BufferedReader(new FileReader(firstFilePath));

                for (String s1 : arrayBlackList) {
                    while ((strOriginal = bfrOriginal.readLine()) != null) {
                        String[] arrayText = strOriginal.split("\\.");

                        for (String s2 : arrayText) {
                            if (s2.contains(s1)) {
                                quantity = quantity + 1;
                                System.out.println(s2.trim());
                            }
                        }
                    }
                }
            }
            if (quantity > 0) {
                System.out.println("Текст не прошел проверку на цензуру. Предложение не соответствующих цензуре в тексте составило " + quantity);
            } else {
                System.out.println("Текст прошел проверку на цензуру");
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
