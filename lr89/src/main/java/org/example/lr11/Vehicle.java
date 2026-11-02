package org.example.lr11;

public class Vehicle {
    private String brand;
    private int year;
    private int speed;

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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Vehicle(String brand, int year, int speed) {
        this.brand = brand;
        this.year = year;
        this.speed = speed;
    }

    public void move() {
        System.out.println("едет ");
    }

    public void move(int dist) {
        System.out.println("проехал " + dist + " км");
    }

    public void move(String where){
        System.out.println("едет в " + where);
    }

}
