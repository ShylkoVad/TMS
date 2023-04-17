package by.teachmeskils.homeworks.hw_14042023.interfaceBuiltFunctional;

import java.util.function.Predicate;

public class EmptyStringPredicate {

    public static void emptyString() {
        String string = "Hello word";
        String stringNull = null;
        String stringCheck = "";

        Predicate<String> emptyStringCheck = str -> !str.isEmpty();
        System.out.println(emptyStringCheck.test(stringCheck));

        Predicate<String> emptyStringNull = str -> str != null;
        System.out.println(emptyStringNull.test(stringNull));

        Predicate<String> emptyStringAnd = emptyStringCheck.and(emptyStringNull);
        System.out.println(emptyStringAnd.test(string));
    }
}
