package by.teachmeskils.homeworks.hw_03032023.animal;

public class Lion extends Feline {

    public Lion(String picture, String food, int hunger, Boundaries boundaries, Location location) {
        super(picture, food, hunger, boundaries, location);
    }

    @Override
    protected void makeNoise() {
        System.out.println("Рррррр!!!");
    }

    @Override
    protected void eat() {
        System.out.println("Лев употребляет в рацион мясо");
    }

    @Override
    protected void roam() {
        System.out.println("Лев бродит в одиночестве");
    }
}
