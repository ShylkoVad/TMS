package by.teachmeskils.homeworks.hw_17032023.censorship;

import java.io.IOException;

public class Main {
    private static String FILE_ORIGINAL = "data\\hw_1703\\OriginalCensorship.txt";
    private static String FILE_BLACK_LIST = "data\\hw_1703\\BlackList.txt";

    public static void main(String[] args) throws IOException {
        CensorshipUtil.checkTextCensorship(FILE_ORIGINAL, FILE_BLACK_LIST);
    }
}

