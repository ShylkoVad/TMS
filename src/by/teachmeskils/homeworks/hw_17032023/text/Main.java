package by.teachmeskils.homeworks.hw_17032023.text;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("data\\hw_1703\\OriginalText.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("data\\hw_1703\\FormaterText.txt"));
             BufferedWriter bufferedWriter1 = new BufferedWriter(new FileWriter("data\\hw_1703\\IntermediateText.txt"));
             BufferedReader bufferedReader1 = new BufferedReader(new FileReader("data\\hw_1703\\IntermediateText.txt"))) {
            String strIntermediate;
            while ((strIntermediate = bufferedReader.readLine()) != null) {
                String[] arrayText = strIntermediate.split("\\.");
                for (String s : arrayText) {
                    bufferedWriter1.write(s + "\n");
                    bufferedWriter1.flush();
                }
            }
            String str;
            while ((str = bufferedReader1.readLine()) != null) {
                if (TextFormater.checkPalindromeString(str) | (TextFormater.returnNumberWords(str) >= 3 & TextFormater.returnNumberWords(str) <= 5)) {
                    bufferedWriter.write(str + "\n");
                    bufferedWriter.flush();
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
