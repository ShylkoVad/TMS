package by.teachmeskils.homeworks.hw_10032023.string;

public class StringUtils {
    private StringUtils() {
    }

    static void returnCharacter() {
        String str1 = "Доброе утро";
        System.out.println(str1.charAt(str1.length() - 1));
    }

    static void checkEndString() {
        String str2 = "Доброе утро!!!";
        String str3 = "!!!";
        System.out.println(str2.endsWith(str3));
    }
    static void checkStartString () {

    }


}
