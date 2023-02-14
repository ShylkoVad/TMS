package by.teachmeskils.homeworks.hw_17022023;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        System.out.print("Введите значение длины квадратного отверстия a = ");
        Scanner scanner_a = new Scanner(System.in);
        double a = scanner_a.nextDouble();

        System.out.print("Введите значение ширины прямоугольного отверстия в мм. b = ");
        Scanner scanner_b = new Scanner(System.in);
        double b = scanner_b.nextDouble();

        System.out.print("Введите значение радиуса круглой картонки в мм. r = ");
        Scanner scanner_r = new Scanner(System.in);
        double r = scanner_r.nextDouble();

        double r_square = Math.sqrt(a * a + b * b) / 2;

        if (r >= r_square) {
            System.out.println("Данной картонкой с радиусом " + r + " мм. можно закрыть прямоугольное отверстие с размерами " + a + " на " + b + " мм.");
        } else {
            System.out.println("Данной картонкой с радиусом " + r + " мм. не возможно закрыть прямоугольное отверстие с размерами " + a + " на " + b + " мм.");
        }
    }
}
