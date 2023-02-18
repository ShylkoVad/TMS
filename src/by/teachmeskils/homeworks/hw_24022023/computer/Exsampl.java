package by.teachmeskils.homeworks.hw_24022023.computer;

public class Exsampl {
    public static void main(String[] args) {
        Inclusion myInclusion = new Inclusion(); // создание объекта класса Inclusion
        Computer myComputer = new Computer("Intel", 64, 1000); // Создаем объект класса (конкретный компьютер)
        myComputer.characteristics(); // вызов метода characteristics у объекта myComputer
        myInclusion.printOn(); // вызов метода
    }
}
