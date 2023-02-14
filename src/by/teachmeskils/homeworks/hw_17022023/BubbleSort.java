package by.teachmeskils.homeworks.hw_17022023;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
//        int[] randoms = new int[]{10, 2, 3, 4, 5, 11}; // иницилизация

        int n = 6;
        double[] randoms = new double[n];


        for (int i = 0; i < randoms.length; i++) {
            randoms[i] =(int) (Math.random()*(200+1)-100); //рандомные числа от -100 до 100
        }
        System.out.println("Вывод значений массива: " + "\n" + Arrays.toString(randoms));

        double temp;

        for (int i = 0; i < randoms.length - 1; i++){
            for (int j = 0; j < randoms.length - 1 - i; j ++) {
                if (randoms[j] > randoms[j + 1]) {
                    temp = randoms[j];
                    randoms[j] = randoms[j + 1];
                    randoms[j + 1] = temp;
                }
            }
        }
        System.out.println( "\n" + "Вывод отсортированного массива: " + "\n" +Arrays.toString(randoms));
    }
}
