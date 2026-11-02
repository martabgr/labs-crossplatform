package org.example.lr10;

public class Circle implements Drawable, Calculatable, Comparable {
    private String color;
    private int radius;
    private int x;
    private int y;

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setX(int x) {
        this.x = x;

    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Circle(String color, int radius, int x, int y) {
        this.color = color;
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public double calculateArea() {
        System.out.println("Площадь: " + Math.PI * radius * radius);
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        System.out.println("Периметр: " + 2 * Math.PI * radius);
        return 2 * Math.PI * radius;

    }

    @Override
    public int compareTo(Object o) {
        Calculatable other = (Calculatable) o;
        return Double.compare(this.calculateArea(), other.calculateArea());
    }

    @Override
    public void draw() {
        System.out.println("нарисовала круг");
    }

    @Override
    public String getColor() {
        return color;
    }
}
