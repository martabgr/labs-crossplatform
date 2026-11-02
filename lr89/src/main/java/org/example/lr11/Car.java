package org.example.lr11;

public class Car extends Vehicle {

    public Car(String brand, int year, int speed) {
        super(brand, year, speed);
    }

    @Override
    public int getSpeed(){
        return super.getSpeed() * 1;
    }

    @Override
    public void  move(){
        System.out.println("машина едет");
    }
}
