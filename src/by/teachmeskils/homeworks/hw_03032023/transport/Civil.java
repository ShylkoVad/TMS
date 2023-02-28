package by.teachmeskils.homeworks.hw_03032023.transport;

public class Civil extends Air {

    public Civil(int power, int speedMax, int weight, String brand, double wingspan, int runwayMin) {
        super(power, speedMax, weight, brand, wingspan, runwayMin);
    }

    @Override
    protected void wingspan() {
        System.out.println("Размах крыльев - " + getWingspan() + " м.;");
    }

    @Override
    protected void runwayMin() {
        System.out.println("Минимальная длина взлетно-посадочной полосы - " + getRunwayMin() + " м.;");
    }

    @Override
    protected void power() {
        System.out.println("Мощность - " + getPower() + " лошадиных сил (" + powerWt() + " кВат.);");
    }

    @Override
    protected void speedMax() {
        System.out.println("Максимальная скорость - " + getSpeedMax() + " км/ч;");
    }

    @Override
    protected void weight() {
        System.out.println("Масса составляет - " + getWeight() + " кг.;");
    }

    @Override
    protected void brand() {
        System.out.println("Бренд - " + getBrand() + ";");
    }

    private int numberPassengersCivilMax;
    private int numberPassengersCivil;
    private boolean businessClass;

    public Civil(int power, int speedMax, int weight, String brand, double wingspan, int runwayMin, int numberPassengersCivilMax, int numberPassengersCivi, boolean businessClass) {
        super(power, speedMax, weight, brand, wingspan, runwayMin);
        this.numberPassengersCivilMax = numberPassengersCivilMax;
        this.numberPassengersCivil = numberPassengersCivi;
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

    public static void main(String[] args) {
        Civil civil = new Civil(90000, 970, 42490, "Boeing 737-900", 34.32,
                2450, 215, 200, false);
        System.out.println("Данный посажирский самолет содежит следующие характеристики: ");
        civil.power();
        civil.speedMax();
        civil.weight();
        civil.brand();
        civil.wingspan();
        civil.runwayMin();
        civil.setNumberPassengersCivil();
        civil.businessClass();
    }
}

