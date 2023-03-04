package by.teachmeskils.homeworks.hw_03032023.transport;

public class GroundTransport extends Transport {
    protected int numberWheels;
    protected int consumptionFuel;

    protected GroundTransport(int power, int speedMax, String brand, int weight, int numberWheels, int consumptionFuel) {
        super(power, speedMax, brand, weight);
        this.numberWheels = numberWheels;
        this.consumptionFuel = consumptionFuel;
    }
}