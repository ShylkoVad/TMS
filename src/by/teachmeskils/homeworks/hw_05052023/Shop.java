package by.teachmeskils.homeworks.hw_05052023;

import java.util.ArrayList;
import java.util.List;

public class Shop implements Runnable {
    private final List<Client> clients = new ArrayList<>();
    private boolean open = false;

    public Shop() {
    }

    public synchronized boolean addClient(Client client) {
        if (clients.size() <= 4 && open) {
            clients.add(client);
            return true;
        }
        return false;
    }

    public synchronized void removeClient(Client client) {
        clients.remove(client);
    }

    @Override
    public void run() {
        try {
            if (clients.size() < 4) {
                open = false;
                System.out.println("Перерыв на 10 секунд");
                Thread.sleep(10000);
            }
            open = true;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}