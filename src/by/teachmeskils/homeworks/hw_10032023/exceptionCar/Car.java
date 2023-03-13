package by.teachmeskils.homeworks.hw_10032023.exceptionCar;

import by.teachmeskils.homeworks.hw_10032023.exceptionCar.exceptions.CustomException;

public class Car {
    private String brand;
    private int speed;
    private int price;

    public Car() {
    }

    public Car(String brand, int speed, int price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void start() throws CustomException {
        int randomStart = (int) (1 + Math.random() * 20); //рандомные числа от (0 до 20] - количество столбцов в строке
        if (randomStart % 2 == 0) {
            throw new CustomException("Автомобиль " + brand + " не завелся");
        }
        System.out.printf("Автомобиль %s завелся\n", brand);
    }
}