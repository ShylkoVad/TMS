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

public class DocumentValidator {
    private DocumentValidator() {
    }

    public static void validate(String fileReport) {
        String docNumeber;
        String validationComment;
        ArrayList<String> filesPathes = new ArrayList<>(); // создаем список путей файлов;
        HashSet<String> docNumbers = new HashSet<>(); // создание списка HashSet
        HashMap<String, String> reportData = new HashMap<>(); // создание списка HashMap

        Scanner pathFile = new Scanner(System.in);
        while (true) {
            String path = pathFile.nextLine();
            if (path.equals("0")) {
              break;
            } else {
                filesPathes.add(path);
            }
        }

        for (String numberListFile : filesPathes) { //пробегаем по массиву, где записаны пути к файлу
            try (BufferedReader bufListFile = new BufferedReader(new FileReader(numberListFile))) {
                while ((docNumeber = bufListFile.readLine()) != null) {
                    docNumbers.add(docNumeber);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        for (String numberListReport : docNumbers) {

            if (numberListReport.length() != 15) {
                validationComment = "invalid - incorrect name of the document, does not match the number length of 15 characters ";
                reportData.put(numberListReport, validationComment);

            } else if (!numberListReport.matches("^[a-zA-Z0-9]*$")) {
                validationComment = "invalid - incorrect name of the document, contains service characters";
                reportData.put(numberListReport, validationComment);

            } else if (!numberListReport.regionMatches(false, 0, "docnum", 0, 5)
                    && !numberListReport.regionMatches(false, 0, "contract", 0, 7)) {
                validationComment = "invalid - incorrect name of the document, number does not start with a sequence 'docnum' or 'contract'";
                reportData.put(numberListReport, validationComment);

            } else {
                validationComment = "valid";
                reportData.put(numberListReport, validationComment);
            }
        }

        try (BufferedWriter bufReport = new BufferedWriter(new FileWriter(fileReport))) {
            for (Map.Entry numberReport : reportData.entrySet()) {
                bufReport.write(numberReport.toString() + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
