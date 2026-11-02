package org.example.lr9;

public class Bird extends Animal {
    private int wingSpan;

    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public Bird(String name, int age, double weight, int wingSpan) {
        super(name, age, weight);
        this.wingSpan = wingSpan;
    }

    @Override
    public void makeSound() {
        System.out.println("Чирик-чирик!");
    }

    @Override
    public void move() {
        System.out.println("летает в небе");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.print(" Размах крыльев: " + this.wingSpan);
    }
}
