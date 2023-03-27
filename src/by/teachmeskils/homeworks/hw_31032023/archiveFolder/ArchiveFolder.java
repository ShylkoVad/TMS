package by.teachmeskils.homeworks.hw_31032023.archiveFolder;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ArchiveFolder {

    public static void archive(String fileFolder, String fileNewFolder, String fileNameWriters, String fileNamePainter,
                               String fileNameMusicians, String fileWriters, String filePainter, String fileMusicians,
                               String fileArchive, String writers, String painter, String musicians) {

        File folder = new File(fileFolder);
        File folderNew = new File(fileNewFolder);
        folder.mkdir();

        try (FileOutputStream fosWriters = new FileOutputStream(fileWriters);
             FileOutputStream fosPainter = new FileOutputStream(filePainter);
             FileOutputStream fosMusicians = new FileOutputStream(fileMusicians);
             ZipOutputStream zout = new ZipOutputStream(new FileOutputStream(fileArchive));
             FileInputStream fisWriters = new FileInputStream(fileWriters);
             FileInputStream fisPainter = new FileInputStream(filePainter);
             FileInputStream fisMusicians = new FileInputStream(fileMusicians)) {

            PrintStream printStreamWriters = new PrintStream(fosWriters);
            PrintStream printStreamPainter = new PrintStream(fosPainter);
            PrintStream printStreamMusicians = new PrintStream(fosMusicians);
            printStreamWriters.println(writers);
            printStreamPainter.println(painter);
            printStreamMusicians.println(musicians);

            ZipEntry entryWriters = new ZipEntry(fileNameWriters);
            ZipEntry entryPainter = new ZipEntry(fileNamePainter);
            ZipEntry entryMusicians = new ZipEntry(fileNameMusicians);

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
