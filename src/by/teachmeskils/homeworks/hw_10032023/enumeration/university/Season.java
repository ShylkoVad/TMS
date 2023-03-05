package by.teachmeskils.homeworks.hw_10032023.enumeration.university;

public enum Season {
    WINTER("Зима"),
    SPRING("Весна"),
    SUMMER("Лето"),
    AUTUMN("Осень");
    String season;

    Season(String season) {
        this.season = season;
    }

    public void time() {

        switch (season) {
            case "Зима", "Осень", "Весна":
                System.out.println(" мы учимся");
                break;
            case "Лето":
                System.out.println(" мы отдыхаем");
                break;
        }
    }
}
