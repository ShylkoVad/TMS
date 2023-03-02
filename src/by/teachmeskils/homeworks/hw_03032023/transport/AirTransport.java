package by.teachmeskils.homeworks.hw_03032023.transport;

public class AirTransport {
    private double wingspan;
    private int runwayMin;

    public AirTransport(double wingspan, int runwayMin) {
        this.wingspan = wingspan;
        this.runwayMin = runwayMin;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public int getRunwayMin() {
        return runwayMin;
    }

    public void setRunwayMin(int runwayMin) {
        this.runwayMin = runwayMin;
    }

    protected void wingspan() {
        System.out.println("Размах крыльев - " + wingspan + " м.;");
    }
    protected void runwayMin() {
        System.out.println("Минимальная длина взлетно-посадочной полосы - " + runwayMin + " м.;");
    }
}