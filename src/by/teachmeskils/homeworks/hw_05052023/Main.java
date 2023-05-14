package by.teachmeskils.homeworks.hw_05052023;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService services = Executors.newFixedThreadPool(8);
        Shop shop = new Shop();
        services.execute(shop);
        List<Future<String>> list = new ArrayList<>();
        for (int i = 1; i < 10; ++i) {
            Future<String> future = services.submit(new Client("Клиент " + i, shop));
            list.add(future);
        }
        services.shutdown();
    }
}