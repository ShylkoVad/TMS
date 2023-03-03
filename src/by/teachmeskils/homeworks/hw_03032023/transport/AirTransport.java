package by.teachmeskils.homeworks.hw_03032023.transport;

public class AirTransport extends Transport {
    protected double wingspan;
    protected int runwayMin;

    protected AirTransport(int power, int speedMax, String brand, int weight, double wingspan, int runwayMin) {
        super(power, speedMax, brand, weight);
        this.wingspan = wingspan;
        this.runwayMin = runwayMin;
    }

    protected void wingspan() {
        System.out.println("Размах крыльев - " + wingspan + " м.;");
    }
    protected void runwayMin() {
        System.out.println("Минимальная длина взлетно-посадочной полосы - " + runwayMin + " м.;");
    }
}