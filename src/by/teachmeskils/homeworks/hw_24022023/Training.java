package by.teachmeskils.homeworks.hw_24022023;

public class Training {
    public static void main(String[] args) {
        int day = 1;
        double traningFirst = 10;
        double traningDay;
        double traning = 0;
        System.out.printf("Спортсмен пробежал в 1 день %.2f км.\n", traningFirst);
        while (day < 7) {
            day++;
            traningDay = traningFirst + traningFirst * 0.1;
            traningFirst = traningDay;
            System.out.printf("Спортсмен пробежал в %d день %.2f км.\n", day, traningFirst);
            traning += traningDay;
        }
        System.out.printf("Всего за %d дней спортсмен пробежал %.2f км.", day, (traning + 10));
    }
}
