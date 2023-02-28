package by.teachmeskils.homeworks.hw_03032023.transport;

public class Military extends Air {
    public Military(int power, int speedMax, int weight, String brand, double wingspan, int runwayMin) {
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

    private boolean ejection;
    private int numberRocket;

    public Military(int power, int speedMax, int weight, String brand, double wingspan, int runwayMin, boolean ejection, int numberRocket) {
        super(power, speedMax, weight, brand, wingspan, runwayMin);
        this.ejection = ejection;
        this.numberRocket = numberRocket;
    }

    protected void ejection() {
        if (ejection == true) {
            System.out.println("Катапультирование прошло успешно;");
        } else {
            System.out.println("У Вас нет такой системы;");
        }
    }

    protected void numberRocket() {
        if (numberRocket == 0) {
            System.out.println("Боеприпасы отсутствуют;");
        } else {
            System.out.println("Ракета пошла;");
        }
    }

    public static void main(String[] args) {

        Military military = new Military(100000, 2120, 9358, "F-16", 9.45, 1000, false, 0);
        System.out.println("Данный военный самолет содежит следующие характеристики: ");
        military.power();
        military.speedMax();
        military.weight();
        military.brand();
        military.wingspan();
        military.runwayMin();
        military.ejection();
        military.numberRocket();
    }
}

