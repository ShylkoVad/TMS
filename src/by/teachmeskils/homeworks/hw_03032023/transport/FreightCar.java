package by.teachmeskils.homeworks.hw_03032023.transport;

public class FreightCar {
    private int loadCapacity;
    private int loadingWeight;

    public FreightCar(int loadCapacity, int loadingWeight) {
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
            System.out.println("Для перевозки груза массой " + loadingWeight + " кг. нам нужен грузовик побольше;");
        }
    }
}
