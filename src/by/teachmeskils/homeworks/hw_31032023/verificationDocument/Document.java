package by.teachmeskils.homeworks.hw_31032023.verificationDocument;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Document {

    public static void countWay(String fileReport) {
        String strNumber;
        String strComment;
        ArrayList<String> listFile = new ArrayList<>(); // создаем список путей файлов;
        HashSet<String> listNumber = new HashSet<>(); // создание списка HashSet
        HashMap<String, String> listReport = new HashMap<>(); // создание списка HashMap

        Scanner pathFile = new Scanner(System.in);
        while (true) {
            String path = pathFile.nextLine();
            listFile.add(path);
            if (path.equals("0")) {
                listFile.remove("0");
                break;
            }
        }

        for (String numberListFile : listFile) { //пробегаем по массиву, где записаны пути к файлу
            try (BufferedReader bufListFile = new BufferedReader(new FileReader(numberListFile))) {
                while ((strNumber = bufListFile.readLine()) != null) {
                    listNumber.add(strNumber);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        for (String numberListReport : listNumber) {

            if (numberListReport.length() != 15) {
                strComment = "invalid - incorrect name of the document, does not match the number length of 15 characters ";
                listReport.put(numberListReport, strComment);

            } else if (!numberListReport.matches("^[a-zA-Z0-9]*$")) {
                strComment = "invalid - incorrect name of the document, contains service characters";
                listReport.put(numberListReport, strComment);

            } else if (!numberListReport.regionMatches(false, 0, "docnum", 0, 5)
                    && !numberListReport.regionMatches(false, 0, "contract", 0, 7)) {
                strComment = "invalid - incorrect name of the document, number does not start with a sequence 'docnum' or 'contract'";
                listReport.put(numberListReport, strComment);

            } else {
                strComment = "valid";
                listReport.put(numberListReport, strComment);
            }
        }

        try (BufferedWriter bufReport = new BufferedWriter(new FileWriter(fileReport))) {
            for (Map.Entry numberReport : listReport.entrySet()) {
                bufReport.write(numberReport.toString() + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
