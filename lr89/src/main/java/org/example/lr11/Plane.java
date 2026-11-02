package org.example.lr11;

public class Plane extends Vehicle{

    public Plane(String brand, int year, int speed) {
        super(brand, year, speed);
    }

    @Override
    public int getSpeed(){
        return super.getSpeed() * 2;
    }
}
