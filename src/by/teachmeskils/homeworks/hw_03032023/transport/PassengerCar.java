package by.teachmeskils.homeworks.hw_03032023.transport;

public class PassengerCar {
    private String typeBody;
    private int numberPassengersCar;
    private int time;


    public PassengerCar(String typeBody, int numberPassengersCar, int time) {
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

    protected void typeBody() {
        System.out.println("Тип кузова - " + typeBody + ";");
    }

    protected void numberPassengersCar() {
        System.out.println("Количество пассажиров - " + numberPassengersCar + " человек;");
    }

    protected double distance() {
        double distance = Transport.speedMax * time;
        return distance;
    }

    protected double consumption() {
        double consumption = distance() * GroundTransport.consumptionFuel / 100;
        return consumption;
    }
}
