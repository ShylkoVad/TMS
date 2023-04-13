package by.teachmeskils.homeworks.hw_14042023.interfaceBuiltFunctional;

import java.util.function.Function;

public class NumberFunction {
    public static void determineSignNumber(int number) {

        Function<Integer, String> numberCheck = i -> {
            if (i > 0) {
                return "Положительное число";
            } else if (i < 0) {
                return "Отрицательное число";
            }
            return "Ноль";
        };
        System.out.println(numberCheck.apply(number));
    }
}
