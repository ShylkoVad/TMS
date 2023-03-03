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

    protected double powerWt() {
        double convertPowerToWt = power * 0.74;
        return convertPowerToWt;
    }

    protected void weight() {
        System.out.println("Масса составляет - " + weight + " кг.;");
    }

    protected void power() {
        System.out.println("Мощность - " + power + " лошадиных сил (" + powerWt() + " кВат.);");
    }

    protected void speedMax() {
        System.out.println("Максимальная скорость составляет - " + speedMax + " км/ч.;");
    }
}
