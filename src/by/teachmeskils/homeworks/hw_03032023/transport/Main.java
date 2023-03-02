package by.teachmeskils.homeworks.hw_03032023.transport;

public class Main {
    public static void main(String[] args) {

        PassengerCar passengerCar = new PassengerCar("хэтчбек", 4, 4);
        GroundTransport groundTransport = new GroundTransport(4, 8);
        Transport transport = new Transport(75, 150, "Skoda", 1500);
        System.out.println("Данный легковой автомобиль содежит следующие характеристики: ");
        transport.weight();
        groundTransport.numberWheels();
        passengerCar.typeBody();
        passengerCar.numberPassengersCar();
        transport.power();
        groundTransport.consumptionFuel();
        System.out.println("За время " + passengerCar.getTime() + " ч, автомобиль " + transport.brand + ", двигаясь с максимальной скоростью " + transport.getSpeedMax() +
                " км/ч пройдет " + passengerCar.distance() + " км и израсходует " + passengerCar.consumption() + " литров топлива;");
        System.out.println("\n*******************************************************************\n");

        FreightCar freightCar = new FreightCar(28000, 29000);
        GroundTransport groundTransport1 = new GroundTransport(6, 28);
        Transport transport1 = new Transport(480, 100, "МАЗ-МАН", 10500);
        System.out.println("Грузовой автомобиль " + transport1.brand + " содежит следующие характеристики: ");
        transport1.weight();
        groundTransport1.numberWheels();
        transport1.power();
        transport1.speedMax();
        groundTransport1.consumptionFuel();
        freightCar.loadCapacity();
        freightCar.loadingWeight();
        System.out.println("\n*******************************************************************\n");

        AirTransport airTransport = new AirTransport(34.32, 2450);
        Transport transport2 = new Transport(90000, 970, "Boeing 737-900", 42490);
        CivilAirplane civilAirplane = new CivilAirplane(215, 220, true);
        System.out.println("Посажирский самолет " + transport2.brand + " содежит следующие характеристики: ");
        transport2.power();
        transport2.speedMax();
        transport2.weight();
        airTransport.wingspan();
        airTransport.runwayMin();
        civilAirplane.setNumberPassengersCivil();
        civilAirplane.businessClass();
        System.out.println("\n*******************************************************************\n");

        Transport transport3 = new Transport(100000,2120, "F-16", 1000);
        AirTransport airTransport1 = new AirTransport(9.45, 1000);
        MilitaryAirplane militaryAirplane = new MilitaryAirplane(true, 0);
        System.out.println("Военный самолет " + transport3.brand + " содежит следующие характеристики: ");
        transport3.power();
        transport3.speedMax();
        transport3.weight();
        airTransport1.wingspan();
        airTransport1.runwayMin();
        militaryAirplane.ejection();
        militaryAirplane.numberRocket();
        System.out.println("\n*******************************************************************\n");
    }
}
