package by.teachmeskils.homeworks.hw_24022023.computer;

import java.util.Scanner;

public class Computer {
    // поля класса
    private String cpu; // тип процессора
    private int ram; // объем оперативной памяти
    private int ssd; // объем жесткого диска
    private int randomOn = (int) (Math.random() * 2); //рандомные число от [0 до 1]
    private int randomOf = (int) (Math.random() * 2); //рандомные число от [0 до 1]

    // создание конструктора Computer с параметрами
    public Computer(String cpu, int ram, int ssd) {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
    }

    // метод ввода числа
    public int on() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public void printOf() {
        System.out.print("Ввести число 0 либо 1 для выключения компьютера: ");
        if (on() == randomOf) {
            System.out.println("Компьютер выключен");
        } else {
            System.out.println("Компьютер сгорел");
            retry();
        }
    }

    public void retry() {
        System.out.print("Введите повторно 0 либо 1: ");
        on();
        System.out.println("Компьютер востановлению не подлежит");
        retry();
    }

    public void printOn() {
        System.out.print("\nВвести число 0 либо 1 для запуска компьютера: ");
        if (on() == randomOn) {
            System.out.println("Добро пожаловать в систему");
            characteristics();
            printOf();
        } else {
            System.out.println("Компьютер сгорел");
            retry();
        }
    }

    // метод вывода значений
    public void characteristics() {
        System.out.printf("Данный компьютер обладает следующими характеристиками:\n 1.) CPU - %s;\n 2.) RAM - %d Гбайт;\n 3.) SSD - %d Гбайт\n", cpu, ram, ssd);
    }
}
