package by.teachmeskils.homeworks.hw_17032023.censorship;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader bfrOriginal = new BufferedReader(new FileReader("data\\hw_1703\\OriginalCensorship.txt"));
             BufferedReader bfrBlackList = new BufferedReader(new FileReader("data\\hw_1703\\BlackList.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("data\\hw_1703\\TextCensorship.txt"))) {

            String strOriginal;
            String strBlackList;
            int quantity = 0;

            while ((strOriginal = bfrOriginal.readLine()) != null) {
                String[] arrayTextOriginal = strOriginal.split("\\.");
                for (String s : arrayTextOriginal) {
                    s = s.trim();
                    bufferedWriter.write(s + "\n");
                    bufferedWriter.flush();
                }
            }
            while ((strBlackList = bfrBlackList.readLine()) != null) {
                String[] arrayBlackList = strBlackList.split("\r\n");
                BufferedReader bufferedReader = new BufferedReader(new FileReader("data\\hw_1703\\TextCensorship.txt"));
                String str1;
                for (String s1 : arrayBlackList) {
                    while ((str1 = bufferedReader.readLine()) != null) {
                        String[] arrayText = str1.split(" ");
                        for (String s2 : arrayText) {
                            if (s2.contains(s1)) {
                                quantity = quantity + 1;
                                System.out.println(str1);
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
            throw new RuntimeException(e);
        }
    }
}

