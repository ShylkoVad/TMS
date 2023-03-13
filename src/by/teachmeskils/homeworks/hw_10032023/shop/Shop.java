package by.teachmeskils.homeworks.hw_10032023.shop;

import by.teachmeskils.homeworks.hw_10032023.shop.exceptions.EmptyProductListException;
import by.teachmeskils.homeworks.hw_10032023.shop.exceptions.EntityAlreadyExistsException;
import by.teachmeskils.homeworks.hw_10032023.shop.exceptions.EntityNotFoundException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Shop {
    ArrayList<Product> shop = new ArrayList<>();

    public void addProduct(Product product) throws EntityAlreadyExistsException {
        for (Product value : shop) {
            if (value.getId() == product.getId()) {
                throw new EntityAlreadyExistsException("The product exists " + product.getId());
            }
        }
        shop.add(product);
    }

    public void getAllProducts() throws EmptyProductListException {
        if (shop.isEmpty() == true) {
            throw new EmptyProductListException("No products found");
        }
        Comparator<Product> comparablePrice = Comparator.comparing(Product::getPrice);
        Collections.sort(shop, comparablePrice.thenComparing(comparablePrice));
        for (Product value : shop) {
            System.out.println(value);
        }
    }

    public void removeProduct(int id) throws EmptyProductListException, EntityNotFoundException {
        if (shop.isEmpty()) {
            throw new EmptyProductListException("No products found");
        } else {
            for (Product value : shop) {
                if (value.getId() == id) {
                    shop.remove(shop.indexOf(value));
                } else {
                    throw new EntityNotFoundException("Product with " + id + " not found");
                }
            }
        }
    }

    public void editProduct(int id, Product product) throws EmptyProductListException, EntityNotFoundException {
        if (shop.isEmpty()) {
            throw new EmptyProductListException("No products found");
        } else {
            for (Product value : shop) {
                if (value.getId() == id) {
                    shop.set(shop.indexOf(value), product);
                } else {
                    throw new EntityNotFoundException("Product with " + id + " not found");
                }
            }
        }
    }
}
