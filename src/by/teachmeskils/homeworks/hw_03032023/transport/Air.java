package by.teachmeskils.homeworks.hw_03032023.transport;

public abstract class Air extends Transport {
    protected Air(int power, int speedMax, int weight, String brand) {
        super(power, speedMax, weight, brand);
    }

    private double wingspan;
    private int runwayMin;

    public Air(int power, int speedMax, int weight, String brand, double wingspan, int runwayMin) {
        super(power, speedMax, weight, brand);
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

    protected abstract void wingspan();

    protected abstract void runwayMin();
}

