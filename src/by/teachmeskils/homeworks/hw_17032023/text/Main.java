package by.teachmeskils.homeworks.hw_17032023.text;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    private static String FILE_ORIGINAL = "data\\hw_1703\\OriginalText.txt";
    private static String FILE_FORMATER = "data\\hw_1703\\FormaterText.txt";

    public static void main(String[] args) {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_ORIGINAL));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FILE_FORMATER))) {
            String strIntermediate;

            while ((strIntermediate = bufferedReader.readLine()) != null) {
                String[] arrayText = strIntermediate.split("\\.");

                for (String s : arrayText) {
                    if (TextFormater.checkPalindromeString(s) | (TextFormater.returnNumberWords(s) >= 3 & TextFormater.returnNumberWords(s) <= 5)) {
                        bufferedWriter.write(s.trim() + "\n");
                        bufferedWriter.flush();
                    }
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
