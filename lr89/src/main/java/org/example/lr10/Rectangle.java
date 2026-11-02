package org.example.lr10;

public class Rectangle implements Drawable, Calculatable, Comparable {
    private String color;
    private double width;
    private double height;
    private int x;
    private int y;

    @Override
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Rectangle(String color, int y, int x, double height, double width) {
        this.y = y;
        this.x = x;
        this.height = height;
        this.width = width;
        this.color = color;
    }

    @Override
    public double calculateArea() {
        System.out.println("Площадь: " + width * height);
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        System.out.println("Периметр: " + 2 * (width + height));
        return 2 * (width + height);
    }

    @Override
    public int compareTo(Object o) {
        Calculatable other = (Calculatable) o;
        return Double.compare(this.calculateArea(), other.calculateArea());
    }

    @Override
    public void draw() {
        System.out.println("нарисовала прямоугольник");
    }
}