package by.teachmeskils.homeworks.hw_24022023.computer;

import java.util.Scanner;

public class Inclusion {
    private int randomOn = (int) (Math.random() * 2); //рандомные число от [0 до 1]
    private int randomOf = (int) (Math.random() * 2); //рандомные число от [0 до 1]

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
//        System.out.println(randomOn);
        System.out.print("\nВвести число 0 либо 1 для запуска компьютера: ");
        if (on() == randomOn) {
            System.out.println("Добро пожаловать в систему");
            printOf();
        } else {
            System.out.println("Компьютер сгорел");
            retry();
        }
    }
}
