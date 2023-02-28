package by.teachmeskils.homeworks.hw_03032023.robot.hands;

public class SonyHand implements IHand {
    public int price;

    public SonyHand(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Поднимается рука Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
