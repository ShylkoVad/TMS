package by.teachmeskils.homeworks.hw_17022023;

import java.util.Scanner;

public class ArrayTwo {
    public static void main(String[] args) {
        System.out.print("Введите значение размера квадратного двумерного массива n = ");
        Scanner scanner_n = new Scanner(System.in);
        int n = scanner_n.nextInt();  // длина массива
        int[][] randoms = new int[n][n]; // иницилизация массива
        System.out.println("Полученный рандомный двумерный массив размером " + n + "x" + n);
        for (int i = 0; i < randoms.length; i++) {
            for (int j = 0; j < randoms.length; j++) {
                randoms[i][j] = (int) (Math.random() * (200 + 1) - 100); //рандомные числа от -100 до 100
                System.out.print(randoms[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nМасив после замены четных чисел на \"0\", а не четных на \"1\" выглядит следующим образом:");
        for (int i = 0; i < randoms.length; i++) {
            for (int j = 0; j < randoms.length; j++) {
                if (randoms[i][j] % 2 == 0) {
                    randoms[i][j] = 0;
                } else {
                    randoms[i][j] = 1;
                }
                System.out.print(randoms[i][j] + " ");
            }
            System.out.println();
        }
    }
}
