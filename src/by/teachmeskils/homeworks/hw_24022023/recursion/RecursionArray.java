package by.teachmeskils.homeworks.hw_24022023.recursion;

import java.util.Arrays;

public class RecursionArray {
    public static void main(String[] args) {
        // Создаем рандомный массив
        int n = 10; // длина массива
        int[] randoms = new int[n]; // иницилизация массива
        for (int i = 0; i < randoms.length; i++) {
            randoms[i] = (int) (Math.random() * (100 + 1)); //рандомные числа от 0 до 100
        }
        System.out.println("Вывод значений массива: " + "\n" + Arrays.toString(randoms));
        System.out.println("Сумма чисел массива : " + sum(randoms, 0));
    }

    static int sum(int[] randoms, int i) {
        if (i >= randoms.length)
            return 0;
        int result = sum(randoms, i + 1);
        return randoms[i] + result;
    }
}
