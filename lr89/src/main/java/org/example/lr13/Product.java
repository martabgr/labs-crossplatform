package org.example.lr13;


public class Product {
    private String name;
    private double price;
    private int quantity;
    private String category;

    public Product(String name, double price, int quantity,String category) throws InvalidPriceException{
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setQuantity(int quantity) throws IllegalArgumentException {

        if (quantity < 0) {
            throw new IllegalArgumentException("Количество не может быть отрицательным");
        }
        this.quantity = quantity;

    }

    public void setPrice(double price) throws InvalidPriceException {
        if (price <= 0) {
            throw new InvalidPriceException("Цена должна быть больше 0");
        }
        this.price = price;
    }

    public void reduceQuantity(int amount) throws OutOfStockException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Количество должно быть больше 0");
        }

        if (amount > quantity) {
            throw new OutOfStockException("Недостаточно товара на складе");
        }

        quantity -= amount;
    }

    public void increasePrice(double percent) {
        if (percent < 0) {
            throw new IllegalArgumentException("Процент не может быть отрицательным");
        }

        price += price * percent / 100;
    }

    public String getName() {
        return name;
    }

    public void printInfo() {
        System.out.println(
                "Название: " + name +", Цена: " + price +", Количество: " + quantity +", Категория: " + category);
    }
}

