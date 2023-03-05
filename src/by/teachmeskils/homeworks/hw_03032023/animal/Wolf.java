package by.teachmeskils.homeworks.hw_03032023.animal;

public class Wolf extends Canine {

    public Wolf(String picture, String food, int hunger, Boundaries boundaries, Location location) {
        super(picture, food, hunger, boundaries, location);
    }

    @Override
    protected void makeNoise() {
        System.out.println("РРРРРР!!!");
    }

    @Override
    protected void eat() {
        System.out.println("Волк употребляет в рацион мясо");
    }
}
