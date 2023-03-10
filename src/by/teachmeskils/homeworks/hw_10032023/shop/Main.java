package by.teachmeskils.homeworks.hw_10032023.shop;

import by.teachmeskils.homeworks.hw_10032023.shop.exceptions.EmptyProductListException;
import by.teachmeskils.homeworks.hw_10032023.shop.exceptions.EntityAlreadyExistsException;
import by.teachmeskils.homeworks.hw_10032023.shop.exceptions.EntityNotFoundException;

public class Main {
    public static void main(String[] args) {

        Shop shop = new Shop();
        Product product1 = new Product(1, "Chocolate", 10);
        Product product2 = new Product(1, "Juice", 4);
        Product product3 = new Product(3, "Fruits", 7);

        try {
            shop.addProduct(product1);
            shop.addProduct(product2);
            shop.addProduct(product3);
        } catch (EntityAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        try {
            shop.getAllProducts();
        } catch (EmptyProductListException e) {
            System.out.println(e.getMessage());
        }
        try {
            shop.removeProduct(1);
        } catch (EmptyProductListException | EntityNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            shop.editProduct(5, new Product(5, "Meat", 15));
        } catch (EmptyProductListException | EntityNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
