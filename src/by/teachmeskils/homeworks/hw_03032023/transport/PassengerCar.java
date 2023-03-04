package by.teachmeskils.homeworks.hw_03032023.transport;

public class PassengerCar extends GroundTransport {
    private String typeBody;
    private int numberPassengersCar;
    private int time;

    public PassengerCar(int power, int speedMax, String brand, int weight, int numberWheels, int consumptionFuel, String typeBody, int numberPassengersCar, int time) {
        super(power, speedMax, brand, weight, numberWheels, consumptionFuel);
        this.typeBody = typeBody;
        this.numberPassengersCar = numberPassengersCar;
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public double calculateDistance() {
        return speedMax * time;
    }

    private void calculateConsumption() {
        double consumption = calculateDistance() * consumptionFuel / 100;
        System.out.println("За время " + time + " ч, автомобиль " + brand + ", двигаясь с максимальной скоростью " + speedMax + " км/ч пройдет "
                + calculateDistance() + " км и израсходует " + calculateDistance() * consumptionFuel / 100 + " литров топлива;");
    }

    @Override
    public String toString() {
        return "PassengerCar{" +
                "typeBody='" + typeBody + '\'' +
                ", numberPassengersCar=" + numberPassengersCar +
                ", time=" + time +
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
