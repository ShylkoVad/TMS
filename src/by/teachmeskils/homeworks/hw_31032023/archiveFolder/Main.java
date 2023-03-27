package by.teachmeskils.homeworks.hw_31032023.archiveFolder;

public class Main {

    private static String FILE_FOLDER = "f:\\JAVA\\TMS\\Tasks\\archiveFolder";
    private static String FILE_NEW_FOLDER = "f:\\JAVA\\TMS\\Tasks\\archiveNewFolder";
    private static String FILE_NAME_WRITERS = "Writers.txt";
    private static String FILE_NAME_PAINTER = "Painter.txt";
    private static String FILE_NAME_MUSICIANS = "Musicians.txt";
    private static String FILE_WRITERS = "f:\\JAVA\\TMS\\Tasks\\archiveFolder\\Writers.txt";
    private static String FILE_PAINTER = "f:\\JAVA\\TMS\\Tasks\\archiveFolder\\Painter.txt";
    private static String FILE_MUSICIANS = "f:\\JAVA\\TMS\\Tasks\\archiveFolder\\Musicians.txt";
    private static String FILE_ARCHIVE = "f:\\JAVA\\TMS\\Tasks\\archiveFolder\\archiveFolder.zip";

    public static void main(String[] args) {
        String writers = "Купала, Пушкин, Колас, Маяковский";
        String painter = "Шишкин, Репин, Шагал";
        String musicians = "Чайковский, Шаляпин, Цой";

        ArchiveFolder.archive(FILE_FOLDER, FILE_NEW_FOLDER, FILE_NAME_WRITERS, FILE_NAME_PAINTER, FILE_NAME_MUSICIANS,
                FILE_WRITERS, FILE_PAINTER, FILE_MUSICIANS, FILE_ARCHIVE, writers, painter, musicians);
    }
}
