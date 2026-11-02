package org.example;

public class Ticket {
    private String event;
    private int seatNumber;
    private double price;


    public Ticket(String event, int seatNumber, double price) {
        this.event = event;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getEvent() {
        return event;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void applyDiscount(double disc) {
        if (disc < 0 || disc > 100) {
            System.out.println("ведите размер скидки от 1 до 100");
            return;
        }
        System.out.println("Цена до скидки: " + this.getPrice());

        this.setPrice(price - (price * disc / 100));
        System.out.println("Цена с скидкой: " + this.getPrice());
    }
}
