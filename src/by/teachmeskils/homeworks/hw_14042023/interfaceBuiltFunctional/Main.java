package by.teachmeskils.homeworks.hw_14042023.interfaceBuiltFunctional;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        EmptyStringPredicate.emptyString();

        Consumer<HeavyBox> printShipment = x -> System.out.printf("Отгрузили ящик с весом %s.\n", x);
        Consumer<HeavyBox> printSend = x -> System.out.printf("Отправляем ящик с весом %s.\n", x);
        printShipment.andThen(printSend).accept(new HeavyBox(50));

        NumberFunction.determineSignNumber(0);

        NumberRandom.returnNumberRandom();
    }
}
