package by.teachmeskils.homeworks.hw_17022023;

public class JaggedArray {
    public static void main(String[] args) {
        int line = (int) (1 + Math.random() * 10); //рандомные числа от (0 до 10] - количество строк
        int column = (int) (1 + Math.random() * 10); //рандомные числа от (0 до 10] - то число столбцов для инициализации массива
        System.out.println("Рандомное число строк матрицы - " + line);
        System.out.println("Рандомное максимальное число столбцов матрицы - " + column);
        System.out.println();
        int[][] randoms = new int[line][column]; // иницилизация массива
        for (int i = 0; i < randoms.length; i++) { // цикл по строкам
            int column_line = (int) (1 + Math.random() * 10); //рандомные числа от (0 до 10] - количество столбцов в строке
            while (column_line > column) { // цикл если число столбцов в строке превышает инициализированное число столбцов в матрице
                column_line = (int) (1 + Math.random() * 10); //рандомные числа от (0 до 10] - количество столбцов в строке
            }
            for (int j = 0; j < column_line; j++) {
                randoms[i][j] = (int) (Math.random() * (200 + 1) - 100); //рандомные числа от -100 до 100
                System.out.print(randoms[i][j] + " ");
            }
            System.out.println();
        }
    }
}
