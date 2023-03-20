package by.teachmeskils.homeworks.hw_17032023.palindrome;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PalindromeFile {
    private static String FILE_ORIGINAL = "data\\hw_1703\\OriginalFile.txt";
    private static String FILE_PALINDROME = "data\\hw_1703\\PalindromeFile.txt";

    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_ORIGINAL));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FILE_PALINDROME))) {
            String strOriginalFile;
            while ((strOriginalFile = bufferedReader.readLine()) != null) {
                String[] arrayText = strOriginalFile.split("\r\n");
                for (String s : arrayText) {
                    StringBuilder palindrome = new StringBuilder(s).reverse();
                    if (s.equalsIgnoreCase(palindrome.toString())) {
                        s = s + "\n";
                        bufferedWriter.write(s);
                        bufferedWriter.flush();
                    }
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
