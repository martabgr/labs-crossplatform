package org.example.lr9;

public class Dog extends Animal {
    private String breed;

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public Dog(String name, int age, double weight, String breed) {
        super(name, age, weight);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Гав-гав!");
    }

    @Override
    public void move() {
        System.out.println("бегает на 4 лапах");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.print(" Порода: " + this.breed);
    }
}
