package by.teachmeskils.homeworks.hw_03032023.transport;

public abstract class Ground extends Transport {

    public Ground(int power, int speedMax, int weight, String brand) {
        super(power, speedMax, weight, brand);
    }

    private int numberWheels;
    private int consumptionFuel;

    public Ground(int power, int speedMax, int weight, String brand, int numberWheels, int consumptionFuel) {
        super(power, speedMax, weight, brand);
        this.numberWheels = numberWheels;
        this.consumptionFuel = consumptionFuel;
    }

    public int getNumberWheels() {
        return numberWheels;
    }

    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    public int getConsumptionFuel() {
        return consumptionFuel;
    }

    public void setConsumptionFuel(int consumptionFuel) {
        this.consumptionFuel = consumptionFuel;
    }

    protected abstract void numberWheels();

    protected abstract void consumptionFuel();
}

