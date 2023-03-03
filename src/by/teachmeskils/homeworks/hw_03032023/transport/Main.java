package by.teachmeskils.homeworks.hw_03032023.transport;

public class Main {
    public static void main(String[] args) {

        PassengerCar car1 = new PassengerCar(75, 150, "Skoda", 1500, 4, 8, "хэтчбек", 4, 5);
        System.out.println("Данный легковой автомобиль содежит следующие характеристики: ");
        car1.weight();
        car1.numberWheels();
        car1.typeBody();
        car1.numberPassengersCar();
        car1.power();
        car1.consumptionFuel();
        System.out.println("За время " + car1.getTime() + " ч, автомобиль " + car1.brand + ", двигаясь с максимальной скоростью " + car1.speedMax + " км/ч пройдет "
                + car1.distance() + " км и израсходует " + car1.consumption() + " литров топлива;");
        System.out.println("\n*******************************************************************\n");

        FreightCar car2 = new FreightCar(480, 100, "МАЗ-МАН", 10500, 6, 28, 28000, 29000);
        System.out.println("Грузовой автомобиль " + car2.brand + " содежит следующие характеристики: ");
        car2.weight();
        car2.numberWheels();
        car2.power();
        car2.speedMax();
        car2.consumptionFuel();
        car2.loadCapacity();
        car2.loadingWeight();
        System.out.println("\n*******************************************************************\n");

        CivilAirplane airplane1 = new CivilAirplane(90000, 970, "Boeing 737-900", 42490, 34.32, 2450, 215, 220, true);
        System.out.println("Посажирский самолет " + airplane1.brand + " содежит следующие характеристики: ");
        airplane1.power();
        airplane1.speedMax();
        airplane1.weight();
        airplane1.wingspan();
        airplane1.runwayMin();
        airplane1.setNumberPassengersCivil();
        airplane1.businessClass();
        System.out.println("\n*******************************************************************\n");

        MilitaryAirplane airplane2 = new MilitaryAirplane(100000, 2120, "F-16", 1000, 9.45, 1000, true, 0);
        System.out.println("Военный самолет " + airplane2.brand + " содежит следующие характеристики: ");
        airplane2.power();
        airplane2.speedMax();
        airplane2.weight();
        airplane2.wingspan();
        airplane2.runwayMin();
        airplane2.ejection();
        airplane2.numberRocket();
        System.out.println("\n*******************************************************************\n");
    }
}
