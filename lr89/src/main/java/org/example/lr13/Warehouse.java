package org.example.lr13;


import java.util.ArrayList;

public class Warehouse {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public Product findProduct(String name)
            throws ProductNotFoundException {

        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }

        throw new ProductNotFoundException("Товар не найден: " + name);
    }

    public void buyProduct(String name, int amount)
            throws ProductNotFoundException, OutOfStockException {

        Product product = findProduct(name);
        product.reduceQuantity(amount);

        System.out.println("Покупка выполнена: " + name);
    }

    public void showProducts() {
        for (Product product : products) {
            product.printInfo();
        }
    }
}

