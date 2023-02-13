package by.teachmeskils.homeworks.hw_17022023;

public class Loop {
    public static void main(String[] args) {
        int line = 4;
        int column = 5;

        for (int y = 0; y < line; ++y) {
            for (int x = 0; x < column; ++x) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
