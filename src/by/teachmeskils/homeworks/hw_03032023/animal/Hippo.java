package by.teachmeskils.homeworks.hw_03032023.animal;

public class Hippo extends Animal {
    public Hippo(String picture, String food, int hunger, Boundaries boundaries, Location location) {
        super(picture, food, hunger, boundaries, location);
    }

    @Override
    protected void makeNoise() {
        System.out.println("Трубит!!!");
    }

    @Override
    protected void eat() {
        System.out.println("Бегемот употребляет в рацион растительную пищу");
    }
}