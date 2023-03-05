package by.teachmeskils.homeworks.hw_03032023.transport;

public class Transport {

    protected int power;
    protected int speedMax;
    protected int weight;
    protected String brand;

    protected Transport(int power, int speedMax, String brand, int weight) {
        this.power = power;
        this.speedMax = speedMax;
        this.brand = brand;
        this.weight = weight;
    }

    protected double convertPowerToKw() {
        return power * 0.74;
    }
}
