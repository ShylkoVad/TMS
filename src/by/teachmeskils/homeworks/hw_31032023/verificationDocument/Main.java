package by.teachmeskils.homeworks.hw_31032023.verificationDocument;

public class Main {

    private static String FILE_REPORT = "f:\\JAVA\\TMS\\Tasks\\validationFile\\report.txt";

    /*
         f:\JAVA\TMS\Tasks\validationFile\documentApril.txt
         f:\JAVA\TMS\Tasks\validationFile\documentFebruary.txt
         f:\JAVA\TMS\Tasks\validationFile\documentJanuary.txt
         f:\JAVA\TMS\Tasks\validationFile\documentMarch.txt
         f:\JAVA\TMS\Tasks\validationFile\documentMay.txt
    */
    public static void main(String[] args) {
        Document.countWay(FILE_REPORT);
    }
}
