package by.teachmeskils.homeworks.hw_03032023.transport;

public class MilitaryAirplane extends AirTransport {
    private boolean ejection;
    private int numberRocket;

    public MilitaryAirplane(int power, int speedMax, String brand, int weight, double wingspan, int runwayMin, boolean ejection, int numberRocket) {
        super(power, speedMax, brand, weight, wingspan, runwayMin);
        this.ejection = ejection;
        this.numberRocket = numberRocket;
    }

    public boolean isEjection() {
        return ejection;
    }

    public void setEjection(boolean ejection) {
        this.ejection = ejection;
    }

    public int getNumberRocket() {
        return numberRocket;
    }

    public void setNumberRocket(int numberRocket) {
        this.numberRocket = numberRocket;
    }

    public boolean makeEjection() {
        if (ejection == true) {
            System.out.println("Катапультирование прошло успешно;");
        } else {
            System.out.println("У Вас нет такой системы;");
        }
        return ejection;
    }

    public int checkRocketsNumber() {
        if (numberRocket == 0) {
            System.out.println("Боеприпасы отсутствуют;");
        } else {
            System.out.println("Ракета пошла;");
        }
        return numberRocket;
    }

    @Override
    public String toString() {
        makeEjection();
        checkRocketsNumber();
        return "MilitaryAirplane{" +
                "ejection=" + ejection +
                ", numberRocket=" + numberRocket +
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
