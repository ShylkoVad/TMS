package by.teachmeskils.homeworks.hw_24022023;

public class Amoeba {
    public static void main(String[] args) {
        int time = 0;
        int hour = 3; // время деления
        int cell = 2; // количество клеток при одном делении
        int amoeba = 1; // первоночальное количество амеб
        for (int i = 0; i < 24; i = i + hour) {
            amoeba = amoeba * cell;
            time = time + hour;
            System.out.printf("При делении амебы в %d часа их количество составит %d\n", time, amoeba);
        }
    }
}
