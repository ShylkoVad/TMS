package by.teachmeskils.homeworks.hw_03032023.transport;

public class CivilAirplane {
    private int numberPassengersCivilMax;
    private int numberPassengersCivil;
    private boolean businessClass;

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

    public CivilAirplane(int numberPassengersCivilMax, int numberPassengersCivil, boolean businessClass) {
        this.numberPassengersCivilMax = numberPassengersCivilMax;
        this.numberPassengersCivil = numberPassengersCivil;
        this.businessClass = businessClass;
    }


    protected void setNumberPassengersCivil() {
        System.out.println("Максимальное количество пассажиров - " + numberPassengersCivilMax + " человек;");
        if (numberPassengersCivil <= numberPassengersCivilMax) {
            System.out.println("Число пасажиров " + numberPassengersCivil + " человек не привышает заявленые характеристики;");
        } else {
            System.out.println("Число пасажиров " + numberPassengersCivil + " человек не соответствует заявленым характеристикам;");
        }
    }

    protected void businessClass() {
        if (businessClass == true) {
            System.out.println("Есть наличие бизнес класса;");
        } else {
            System.out.println("Есть только эконом класс;");
        }
    }
}
