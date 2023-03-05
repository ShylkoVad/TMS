package by.teachmeskils.homeworks.hw_03032023.transport;

public class CivilAirplane extends AirTransport {
    private int numberPassengersCivilMax;
    private int numberPassengersCivil;
    private boolean businessClass;

    public CivilAirplane(int power, int speedMax, String brand, int weight, double wingspan, int runwayMin, int numberPassengersCivilMax, int numberPassengersCivil, boolean businessClass) {
        super(power, speedMax, brand, weight, wingspan, runwayMin);
        this.numberPassengersCivilMax = numberPassengersCivilMax;
        this.numberPassengersCivil = numberPassengersCivil;
        this.businessClass = businessClass;
    }

    public int getNumberPassengersCivilMax() {
        return numberPassengersCivilMax;
    }

    public void setNumberPassengersCivilMax(int numberPassengersCivilMax) {
        this.numberPassengersCivilMax = numberPassengersCivilMax;
    }

    public int getNumberPassengersCivil() {
        return numberPassengersCivil;
    }

    public void setNumberPassengersCivil(int numberPassengersCivil) {
        this.numberPassengersCivil = numberPassengersCivil;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }

    public void setNumberPassengersCivil() {
        if (numberPassengersCivil <= numberPassengersCivilMax) {
            System.out.println("Число пасажиров " + numberPassengersCivil + " человек не привышает заявленые характеристики;");
        } else {
            System.out.println("Число пасажиров " + numberPassengersCivil + " человек не соответствует заявленым характеристикам;");
        }
    }

    public void checkBusinessClass() {
        if (businessClass == true) {
            System.out.println("Есть наличие бизнес класса;");
        } else {
            System.out.println("Есть только эконом класс;");
        }
    }

    @Override
    public String toString() {
        setNumberPassengersCivil();
        checkBusinessClass();
        return "CivilAirplane{" +
                "numberPassengersCivilMax=" + numberPassengersCivilMax +
                ", numberPassengersCivil=" + numberPassengersCivil +
                ", businessClass=" + businessClass +
                ", wingspan=" + wingspan +
                ", runwayMin=" + runwayMin +
                ", power=" + power +
                ", speedMax=" + speedMax +
                ", weight=" + weight +
                ", convertPowerToWt=" + convertPowerToKw() +
                ", brand='" + brand + '\'' +
                '}';
    }
}