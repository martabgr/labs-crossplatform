package org.example;

public class Rectangle {
    private int width;
    private double height;
    public Rectangle(int width,double height){
        this.width=width;
        this.height=height;
    }
    public void setWidth(int width){
        this.width=width;
    }
    public int getWidth(){
        return width;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getHeight(){
        return height;
    }


    public void area(int a,double b){
        System.out.println("Площадь: " + a*b);
    }
    public void perimeter(int a,double b){
        System.out.println("Периметр: "+(a+b)*2);
    }
}
