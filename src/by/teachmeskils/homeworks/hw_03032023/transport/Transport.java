package by.teachmeskils.homeworks.hw_03032023.transport;

public class Transport {

    protected int power;
    protected static int speedMax;
    protected int weight;
    protected boolean weightWt;
    protected String brand;

    protected Transport(int power, int speedMax, String brand, int weight) {
        this.power = power;
        this.speedMax = speedMax;
        this.brand = brand;
        this.weight = weight;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getSpeedMax() {
        return speedMax;
    }

    public void setSpeedMax(int speedMax) {
        this.speedMax = speedMax;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isWeightWt() {
        return weightWt;
    }

    public void setWeightWt(boolean weightWt) {
        this.weightWt = weightWt;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    protected double powerWt() {
        double powerWt = power * 0.74;
        return powerWt;
    }

    protected void weight() {
        System.out.println("Масса составляет - " + weight + " кг.;");
    }

    protected void power() {
        System.out.println("Мощность - " + power + " лошадиных сил (" + powerWt() + " кВат.);");
    }
    protected void speedMax(){
        System.out.println("Максимальная скорость составляет - " + speedMax + " км/ч.;");
    }
}