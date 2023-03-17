package by.teachmeskils.homeworks.hw_17032023.text;

public class TextFormater {
    private TextFormater() {
    }

    static int returnNumberWords(String str) {

        String[] arrayText = str.split(" ");
        return arrayText.length;
    }

    static boolean checkPalindromeString(String str) {

        str = str.replaceAll("\\p{P}", "").replaceAll("  ", " ");
        String[] arrayText = str.split(" ");

        for (String s : arrayText) {
            StringBuilder palindrome = new StringBuilder(s).reverse();
            if (s.equalsIgnoreCase(palindrome.toString())) {
                return true;
            }
        }
        return false;
    }
}
