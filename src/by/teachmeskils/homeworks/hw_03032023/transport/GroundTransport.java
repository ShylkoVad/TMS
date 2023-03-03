package by.teachmeskils.homeworks.hw_03032023.transport;

public class GroundTransport extends Transport {
    protected int numberWheels;
    protected int consumptionFuel;

    protected GroundTransport(int power, int speedMax, String brand, int weight, int numberWheels, int consumptionFuel) {
        super(power, speedMax, brand, weight);
        this.numberWheels = numberWheels;
        this.consumptionFuel = consumptionFuel;
    }

    protected void numberWheels() {
        System.out.println("Количество установленных колес составляет - " + numberWheels + ";");
    }

    protected void consumptionFuel() {
        System.out.println("Расход топлива - " + consumptionFuel + " литров / 100 км.;");
    }
}