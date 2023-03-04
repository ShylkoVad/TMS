package by.teachmeskils.homeworks.hw_03032023.animal;

public class Tiger extends Feline {

    public Tiger(String picture, String food, int hunger, Boundaries boundaries, Location location) {
        super(picture, food, hunger, boundaries, location);
    }

    @Override
    protected void makeNoise() {
        System.out.println("Р-Р-Р-Р!!!");
    }

    @Override
    protected void eat() {
        System.out.println("Тигр принимает в пищу мясо");
    }
}
