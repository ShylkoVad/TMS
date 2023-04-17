package by.teachmeskils.homeworks.hw_14042023.interfaceFunctional;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String str = "I love java";
        int numberFactorial = 5;
        Scanner number = new Scanner(System.in);
        int numberInput = number.nextInt();

        InterfaceFunctional<String> lambda1 = s -> new StringBuilder(str).reverse().toString();
        InterfaceFunctional<Integer> lambda2 = s -> {
            int res = 1;
            for (int i = 2; i <= s; i++)
                res *= i;
            return res;
        };
        switch (numberInput) {
            case 1 -> System.out.println(lambda1.printable(str));
            case 2 -> System.out.println(lambda2.printable(numberFactorial));
        }
    }
}
