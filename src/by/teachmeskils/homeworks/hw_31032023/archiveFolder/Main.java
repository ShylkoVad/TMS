package by.teachmeskils.homeworks.hw_31032023.archiveFolder;

public class Main {

    private static String FILE_FOLDER = "f:\\JAVA\\TMS\\Tasks\\archiveFolder";
    private static String FILE_NEW_FOLDER = "f:\\JAVA\\TMS\\Tasks\\archiveNewFolder";
    private static String FILE_NAME_WRITERS = "Writers.txt";
    private static String FILE_NAME_PAINTER = "Painter.txt";
    private static String FILE_NAME_MUSICIANS = "Musicians.txt";


    public static void main(String[] args) {
        String writers = "Купала, Пушкин, Колас, Маяковский";
        String painter = "Шишкин, Репин, Шагал";
        String musicians = "Чайковский, Шаляпин, Цой";

        ArchiveUtil.archive(FILE_FOLDER, FILE_NEW_FOLDER, FILE_NAME_WRITERS, FILE_NAME_PAINTER, FILE_NAME_MUSICIANS,
                writers, painter, musicians);
    }
}
