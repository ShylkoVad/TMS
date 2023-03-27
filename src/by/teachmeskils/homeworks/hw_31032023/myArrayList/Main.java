package by.teachmeskils.homeworks.hw_31032023.myArrayList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> strings = new MyArrayList<>(); // массив String
        strings.add("Зима");
        strings.add("Весна");
        strings.add("Лето");
        strings.add("Осень");

        System.out.println(Arrays.toString(strings.getArray()));
//        System.out.println(strings.get(2));
//        System.out.println(strings.size());
//        strings.update(3, "Солнце");
//        strings.indexOf("Привет");
        strings.delete(1);
        strings.addIndex(7, "Солнце");
//        strings.clearing();
        System.out.println(Arrays.toString(strings.getArray()));
    }
}
