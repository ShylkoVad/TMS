package by.teachmeskils.homeworks.hw_31032023.archiveFolder;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ArchiveUtil {
    private static String FILE_WRITERS = "f:\\JAVA\\TMS\\Tasks\\archiveFolder\\Writers.txt";
    private static String FILE_PAINTER = "f:\\JAVA\\TMS\\Tasks\\archiveFolder\\Painter.txt";
    private static String FILE_MUSICIANS = "f:\\JAVA\\TMS\\Tasks\\archiveFolder\\Musicians.txt";
    private static String FILE_ARCHIVE = "f:\\JAVA\\TMS\\Tasks\\archiveFolder\\archiveFolder.zip";
    private static String FILE_FOLDER = "f:\\JAVA\\TMS\\Tasks\\archiveFolder";
    private static String FILE_NEW_FOLDER = "f:\\JAVA\\TMS\\Tasks\\archiveNewFolder";
    private static String FILE_NAME_WRITERS = "Writers.txt";
    private static String FILE_NAME_PAINTER = "Painter.txt";
    private static String FILE_NAME_MUSICIANS = "Musicians.txt";

    public static void archive(String writers, String painter, String musicians) {

        File folder = new File(FILE_FOLDER);
        File folderNew = new File(FILE_NEW_FOLDER);
        folder.mkdir();

        try (FileOutputStream fosWriters = new FileOutputStream(FILE_WRITERS);
             FileOutputStream fosPainter = new FileOutputStream(FILE_PAINTER);
             FileOutputStream fosMusicians = new FileOutputStream(FILE_MUSICIANS);
             ZipOutputStream zout = new ZipOutputStream(new FileOutputStream(FILE_ARCHIVE));
             FileInputStream fisWriters = new FileInputStream(FILE_WRITERS);
             FileInputStream fisPainter = new FileInputStream(FILE_PAINTER);
             FileInputStream fisMusicians = new FileInputStream(FILE_MUSICIANS)) {

            PrintStream printStreamWriters = new PrintStream(fosWriters);
            PrintStream printStreamPainter = new PrintStream(fosPainter);
            PrintStream printStreamMusicians = new PrintStream(fosMusicians);
            printStreamWriters.println(writers);
            printStreamPainter.println(painter);
            printStreamMusicians.println(musicians);

            ZipEntry entryWriters = new ZipEntry(FILE_NAME_WRITERS);
            ZipEntry entryPainter = new ZipEntry(FILE_NAME_PAINTER);
            ZipEntry entryMusicians = new ZipEntry(FILE_NAME_MUSICIANS);

            zout.putNextEntry(entryWriters);
            byte[] byfferWriters = new byte[fisWriters.available()];
            fisWriters.read(byfferWriters);
            zout.write(byfferWriters);
            zout.closeEntry();

            zout.putNextEntry(entryPainter);
            byte[] byfferPainter = new byte[fisPainter.available()];
            fisPainter.read(byfferPainter);
            zout.write(byfferPainter);
            zout.closeEntry();

            zout.putNextEntry(entryMusicians);
            byte[] byfferMusicians = new byte[fisMusicians.available()];
            fisMusicians.read(byfferMusicians);
            zout.write(byfferMusicians);
            zout.closeEntry();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        folder.renameTo(folderNew); // переименовать
        Arrays.stream(folderNew.listFiles()).forEach(f -> System.out.println(f.getName())); // вывести содержимое папки в консоль

        for (File file : folderNew.listFiles()) {
            file.delete();
        }
        folderNew.delete();
    }
}
