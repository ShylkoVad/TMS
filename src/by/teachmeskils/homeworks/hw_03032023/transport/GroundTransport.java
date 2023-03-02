package by.teachmeskils.homeworks.hw_03032023.transport;

public class GroundTransport {
    private int numberWheels;
    protected static int consumptionFuel;

    public GroundTransport(int numberWheels, int consumptionFuel) {
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

    protected void numberWheels() {
        System.out.println("Количество установленных колес составляет - " + numberWheels + ";");
    }
    protected void consumptionFuel() {
        System.out.println("Расход топлива - " + consumptionFuel + " литров / 100 км.;");
    }
}
