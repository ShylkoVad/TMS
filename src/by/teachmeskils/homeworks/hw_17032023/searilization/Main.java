package by.teachmeskils.homeworks.hw_17032023.searilization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static String FILE_NAME = "data\\hw_1703\\car.data";

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", 180, 10000));
        cars.add(new Car("AUDI", 170, 8000));
        cars.add(new Car("LADA", 150, 3000));

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            objectOutputStream.writeObject(cars);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        List<Car> newCar = new ArrayList<>();

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            newCar = (List<Car>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        newCar.forEach(System.out::println);
    }
}
