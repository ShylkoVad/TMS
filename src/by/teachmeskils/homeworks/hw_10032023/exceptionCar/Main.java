package by.teachmeskils.homeworks.hw_10032023.exceptionCar;

import by.teachmeskils.homeworks.hw_10032023.exceptionCar.exceptions.CustomException;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("BMW", 200, 20000);
        Car car2 = new Car("Audi", 180, 15000);
        Car car3 = new Car("Skoda", 150, 9800);
        try {
            car1.start();
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
        try {
            car2.start();
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
        try {
            car3.start();
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}


