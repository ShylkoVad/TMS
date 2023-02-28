package by.teachmeskils.homeworks.hw_03032023.transport;

public class PassengerCar extends Ground {


    public PassengerCar(int power, int speedMax, int weight, String brand, int numberWheels, int consumptionFuel) {
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

    private String typeBody;
    private int numberPassengersCar;
    private int time;

    public PassengerCar(int power, int speedMax, int weight, String brand, int numberWheels, int consumptionFuel, String typeBody, int numberPassengersCar, int time) {
        super(power, speedMax, weight, brand, numberWheels, consumptionFuel);
        this.typeBody = typeBody;
        this.numberPassengersCar = numberPassengersCar;
        this.time = time;
    }

    protected void typeBody() {
        System.out.println("Тип кузова - " + typeBody + ";");
    }

    protected void numberPassengersCar() {
        System.out.println("Количество пассажиров - " + numberPassengersCar + " человек;");
    }


    protected double distance() {
        double distance = getSpeedMax() * time;
        return distance;
    }

    protected double consumption() {
        double consumption = distance() * getConsumptionFuel() / 100;
        return consumption;
    }

    public static void main(String[] args) {
        PassengerCar passengerCar = new PassengerCar(75, 150, 1500, "Skoda", 4,
                8, "хэтчбек", 4, 4);
        System.out.println("Данный легковой автомобиль содежит следующие характеристики: ");
        passengerCar.weight();
        passengerCar.numberWheels();
        passengerCar.typeBody();
        passengerCar.numberPassengersCar();
        passengerCar.power();
        passengerCar.consumptionFuel();
        System.out.println("За время " + passengerCar.time + " ч, автомобиль " + passengerCar.getBrand() + ", двигаясь с максимальной скоростью " + passengerCar.getSpeedMax() +
                " км/ч пройдет " + passengerCar.distance() + " км и израсходует " + passengerCar.consumption() + " литров топлива;");
    }
}

