package by.teachmeskils.homeworks.hw_31032023.archiveFolder;

public class Main {

    public static void main(String[] args) {
        String writers = "Купала, Пушкин, Колас, Маяковский";
        String painter = "Шишкин, Репин, Шагал";
        String musicians = "Чайковский, Шаляпин, Цой";

        ArchiveUtil.archive(writers, painter, musicians);
    }
}
