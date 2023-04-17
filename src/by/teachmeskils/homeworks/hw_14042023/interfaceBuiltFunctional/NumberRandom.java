package by.teachmeskils.homeworks.hw_14042023.interfaceBuiltFunctional;

import java.util.function.Supplier;

public class NumberRandom {
    public static void returnNumberRandom() {
        Supplier<Integer> numberRandom = () -> (int) (Math.random() * (10 + 1));
        System.out.println(numberRandom.get());
    }
}
