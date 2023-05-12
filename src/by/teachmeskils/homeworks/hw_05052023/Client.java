package by.teachmeskils.homeworks.hw_05052023;

import java.util.concurrent.Callable;

public class Client implements Callable<String> {
    private final String name;
    private final Shop shop;

    Client(String name, Shop shop) {
        this.name = name;
        this.shop = shop;
    }

    public void enterShop() {
        try {
            while (!shop.addClient(this)) {
                Thread.sleep(500);
                System.out.println(name + " ждет в очереди");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name + " вошел в магазин");
    }

    public void shopping() {
        try {
            Thread.sleep((int) (Math.random() * 8000 + 1000));
            System.out.println(name + " приобрел товар");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void exitShop() {
        shop.removeClient(this);
        System.out.println(name + " вышел из магазина");
    }

    @Override
    public String call() {
        enterShop();
        shopping();
        exitShop();
        return null;
    }
}