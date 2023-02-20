package by.teachmeskils.homeworks.hw_24022023.recursion;

public class RecursionDegree {
    public static void main(String[] args) {
        int numberN = 2;
        System.out.println(dergee(numberN));
    }

    static String dergee(double numberN) {
        if (numberN == 1) {
            return "Yes";
        } else if (numberN > 1 && numberN < 2) {
            return "No";
        } else {
            return dergee(numberN / 2);
        }
    }
}
