package by.teachmeskils.homeworks.hw_03032023.transport;

public abstract class Transport {

    private int power;
    private int speedMax;
    private int weight;
    private boolean weightWt;
    private String brand;

    protected Transport(int power, int speedMax, int weight, String brand) {
        this.power = power;
        this.speedMax = speedMax;
        this.weight = weight;
        this.brand = brand;
    }

    public boolean isWeightWt() {
        return weightWt;
    }

    public void setWeightWt(boolean weightWt) {
        this.weightWt = weightWt;
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    protected abstract void power();

    protected abstract void speedMax();

    protected abstract void weight();

    protected abstract void brand();

    protected double powerWt() {
        double powerWt = power * 0.74;
        return powerWt;
    }
}
