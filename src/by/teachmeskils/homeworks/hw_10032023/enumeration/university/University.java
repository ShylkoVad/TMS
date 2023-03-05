package by.teachmeskils.homeworks.hw_10032023.enumeration.university;

public class University {
    private int numberOfStudents;

    public University(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public static void main(String[] args) {
        University university = new University(587);
        Season season = Season.SUMMER;
        System.out.print("Школа №3, учащихся " + university.numberOfStudents + " сейчас");
        season.time();
    }
}

