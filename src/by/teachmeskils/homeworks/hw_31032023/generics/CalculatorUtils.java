package by.teachmeskils.homeworks.hw_31032023.generics;

public class CalculatorUtils {
    public CalculatorUtils() {
    }

    public static <V extends Number, T extends Number> Double sum(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static <V extends Number, T extends Number> Double difference(T a, T b) {
        return a.doubleValue() - b.doubleValue();
    }

    public static <V extends Number, T extends Number> Double multiply(T a, T b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static <V extends Number, T extends Number> Double divide(T a, T b) {
        return a.doubleValue() / b.doubleValue();
    }
}
