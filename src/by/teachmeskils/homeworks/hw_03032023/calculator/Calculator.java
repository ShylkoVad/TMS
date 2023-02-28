package by.teachmeskils.homeworks.hw_03032023.calculator;

public class Calculator {
    private double number1;
    private double number2;

    public Calculator(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public double getSum() {
        double sum = number1 + number2;
        return sum;
    }

    public double getMultiplication() {
        double multiplication = getNumber1() * getNumber2();
        return multiplication;
    }

    public double getMinus() {
        double minus = getNumber2() - getNumber1();
        return minus;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator(8.5, 9);
        System.out.println(calculator.getSum());
        System.out.println(calculator.getMultiplication());
        System.out.println(calculator.getMinus());
    }
}

