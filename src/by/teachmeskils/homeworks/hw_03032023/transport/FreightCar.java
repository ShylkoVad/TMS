package by.teachmeskils.homeworks.hw_03032023.transport;

public class FreightCar extends GroundTransport {
    private int loadCapacity;
    private int loadingWeight;

    public FreightCar(int power, int speedMax, String brand, int weight, int numberWheels, int consumptionFuel, int loadCapacity, int loadingWeight) {
        super(power, speedMax, brand, weight, numberWheels, consumptionFuel);
        this.loadCapacity = loadCapacity;
        this.loadingWeight = loadingWeight;
    }

    public void comparisonWeight() {
        if (loadCapacity >= loadingWeight) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }

    @Override
    public String toString() {
        return "FreightCar{" +
                "loadCapacity=" + loadCapacity +
                ", loadingWeight=" + loadingWeight +
                ", numberWheels=" + numberWheels +
                ", consumptionFuel=" + consumptionFuel +
                ", power=" + power +
                ", speedMax=" + speedMax +
                ", weight=" + weight +
                ", convertPowerToWt=" + convertPowerToKw() +
                ", brand='" + brand + '\'' +
                '}';
    }
}