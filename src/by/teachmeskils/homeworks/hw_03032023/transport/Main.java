package by.teachmeskils.homeworks.hw_03032023.transport;

public class Main {
    public static void main(String[] args) {


        PassengerCar car1 = new PassengerCar(75, 150, "Skoda", 1500, 4, 8, "хэтчбек", 4, 5);
        FreightCar car2 = new FreightCar(480, 100, "МАЗ-МАН", 10500, 6, 28, 28000, 29000);
        CivilAirplane airplane1 = new CivilAirplane(90000, 970, "Boeing 737-900", 42490, 34.32, 2450, 215, 220, true);
        MilitaryAirplane airplane2 = new MilitaryAirplane(100000, 2120, "F-16", 1000, 9.45, 1000, true, 0);

        Transport[] transports = {car1, car2, airplane1, airplane2};
        for (Transport transport : transports) {
            System.out.println(transport);
        }
        System.out.println("\n*******************************************************************\n");

        AirTransport[] airTransports = {airplane1, airplane2};
        for (AirTransport airTransport : airTransports) {
            System.out.println(airTransport);
        }
        System.out.println("\n*******************************************************************\n");

        GroundTransport[] groundTransports = {car1, car2};
        for (GroundTransport groundTransport : groundTransports) {
            System.out.println(groundTransport);
        }
        System.out.println("\n*******************************************************************\n");
    }
}