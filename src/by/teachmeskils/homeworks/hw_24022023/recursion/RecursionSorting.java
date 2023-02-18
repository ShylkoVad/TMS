package by.teachmeskils.homeworks.hw_24022023.recursion;

public class RecursionSorting {
    public static void main(String[] args) {
        int numberA;
        int numberB;
        numberA = (int) (Math.random() * (20 + 1) - 10); //рандомные числа от -100 до 100
        numberB = (int) (Math.random() * (20 + 1) - 10); //рандомные числа от -100 до 100
        System.out.println("Число А составляет: " + numberA);
        System.out.println("Число B составляет: " + numberB);
        System.out.print(" " + sorting(numberA, numberB));
    }

    static int sorting(int numberA, int numberB) {
        if (numberA < numberB) {
            int sum = sorting(numberA, numberB - 1);
            System.out.print(" " + sum);
        } else if (numberA > numberB) {
            int sum = sorting(numberA, numberB + 1);
            System.out.print(" " + sum);
        }
        return numberB;
    }
}
