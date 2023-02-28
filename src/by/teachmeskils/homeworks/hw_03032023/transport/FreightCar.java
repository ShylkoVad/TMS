package by.teachmeskils.homeworks.hw_03032023.transport;

public class FreightCar extends Ground {
    protected FreightCar(int power, int speedMax, int weight, String brand, int numberWheels, int consumptionFuel) {
        super(power, speedMax, weight, brand, numberWheels, consumptionFuel);
    }

    @Override
    protected void numberWheels() {
        System.out.println("Количество установленных колес составляет - " + getNumberWheels() + ";");
    }

    @Override
    protected void consumptionFuel() {
        System.out.println("Расход топлива - " + getConsumptionFuel() + " литров / 100 км.;");
    }

    @Override
    protected void power() {
        System.out.println("Мощность - " + getPower() + " лошадиных сил (" + powerWt() + " кВат.);");
    }

    @Override
    protected void speedMax() {
    }

    @Override
    protected void weight() {
        System.out.println("Масса составляет - " + getWeight() + " кг.;");
    }

    @Override
    protected void brand() {
    }

    private int loadCapacity;
    private int loadingWeight;

    public FreightCar(int power, int speedMax, int weight, String brand, int numberWheels, int consumptionFuel, int loadCapacity, int loadingWeight) {
        super(power, speedMax, weight, brand, numberWheels, consumptionFuel);
        this.loadCapacity = loadCapacity;
        this.loadingWeight = loadingWeight;
    }

    protected void loadCapacity() {
        System.out.println("Грузоподъемность составляет - " + loadCapacity + " кг.;");
    }

    protected void loadingWeight() {
        if (loadCapacity >= loadingWeight) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }

    public static void main(String[] args) {
        FreightCar freightCar = new FreightCar(480, 100, 10500, "МАЗ-МАН", 6, 28, 28000, 28000);
        System.out.println("Данный грузовой автомобиль содежит следующие характеристики: ");
        freightCar.weight();
        freightCar.numberWheels();
        freightCar.power();
        freightCar.consumptionFuel();
        freightCar.loadCapacity();
        freightCar.loadingWeight();
    }
}

