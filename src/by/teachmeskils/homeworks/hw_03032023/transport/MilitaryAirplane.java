package by.teachmeskils.homeworks.hw_03032023.transport;

public class MilitaryAirplane {
    private boolean ejection;
    private int numberRocket;

    public MilitaryAirplane(boolean ejection, int numberRocket) {
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
}
