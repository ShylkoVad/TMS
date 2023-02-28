package by.teachmeskils.homeworks.hw_03032023.animal;

public class Cat extends Feline {

    public Cat(String picture, String food, int hunger, Boundaries boundaries, Location location) {
        super(picture, food, hunger, boundaries, location);
    }

    @Override
    protected void makeNoise() {
        System.out.println("Мяу!!!");
    }

    @Override
    protected void eat() {
        System.out.println("Кошка принимает в пищу мясо");
    }

    @Override
    protected void roam() {
        System.out.println("Кошка гуляет в одиночестве");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "picture='" + picture + '\'' +
                ", food='" + food + '\'' +
                ", hunger=" + hunger +
                ", boundaries=" + boundaries +
                ", location=" + location +
                '}';
    }
}
