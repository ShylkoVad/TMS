package by.teachmeskils.homeworks.hw_17032023.palindrome;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PalindromeFile {
    public static void main(String[] args) throws IOException {
        try (FileInputStream originalFile = new FileInputStream("data\\hw_1703\\OriginalFile.txt");
             FileOutputStream palindromeFile = new FileOutputStream("data\\hw_1703\\PalindromeFile.txt")) {
            byte[] buffer = originalFile.readAllBytes();
            String str = new String(buffer);
            String[] arrayText = str.split("\r\n");

            for (String s : arrayText) {
                StringBuilder palindrome = new StringBuilder(s).reverse();
                if (s.equalsIgnoreCase(palindrome.toString())) {
                    s = s + "\n";
                    palindromeFile.write(s.getBytes());
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
