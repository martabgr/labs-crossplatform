package org.example;

import org.example.lr10.Comparable;

import org.example.lr10.Calculatable;
import org.example.lr10.Circle;
import org.example.lr10.Rectangle;
import org.example.lr11.Car;
import org.example.lr11.Plane;
import org.example.lr11.Vehicle;
import org.example.lr13.*;
import org.example.lr8.Developer;
import org.example.lr8.Employee;
import org.example.lr8.Manager;
import org.example.lr9.Animal;
import org.example.lr9.Bird;
import org.example.lr9.Dog;

import java.io.BufferedReader;
import java.util.Scanner;

/**
 * Unit test for simple App.
 */


public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("1 - 8 лаба, 2 - 9 лаба, 3 - 10 лаба, 4 - 11 лаба");

            int choice = in.nextInt();
            in.nextLine();
            switch (choice) {
                case 1:
                    Employee[] arr = new Employee[5];
                    arr[0] = new Manager("Tolik", 2343, 4, 56);
                    arr[1] = new Manager("Lelik", 2643, 1, 56);
                    arr[2] = new Manager("Bolik", 2841, 2, 12);
                    arr[3] = new Developer("Molik", 8743, 7, "java");
                    arr[4] = new Developer("Polik", 4567, 8, "kotlin");
                    System.out.println("Менеджер: ");
                    Employee a = new Employee("", 6, 1);
                    Employee b = new Manager("", 5, 5, 5);
                    Manager c = new Manager("", 1, 1, 1);
                    for (int i = 0; i < 3; i++) {
                        arr[i].displayInfo();
                        arr[i].work();
                        ((Manager) arr[i]).holdMeeting();
                    }
                    System.out.println("Разработчик: ");
                    for (int i = 3; i < 5; i++) {
                        arr[i].displayInfo();
                        arr[i].work();
                        ((Developer) arr[i]).debugCode();
                    }

                    break;
                case 2:
                    //Animal a=new Animal("ghj",34,345);
                    Animal[] arr1 = new Animal[5];
                    arr1[0] = new Dog("Tolik", 23, 45, "бульдог");
                    arr1[1] = new Dog("Lelik", 26, 15, "чихуахуа");
                    arr1[2] = new Bird("Bolik", 28, 2, 12);
                    arr1[3] = new Bird("Molik", 8, 1, 45);
                    arr1[4] = new Bird("Polik", 4, 0.5, 10);
                    System.out.println("Животные: ");
                    for (int i = 0; i < 5; i++) {
                        arr1[i].displayInfo();
                        arr1[i].makeSound();
                        arr1[i].move();
                    }
                    break;
                case 3:

                    Calculatable[] arr2 = new Calculatable[5];
                    arr2[0] = new Circle("Красный", 5, 10, 10);
                    arr2[1] = new Circle("Синий", 3, 20, 20);
                    arr2[2] = new Circle("Зелёный", 7, 30, 30);
                    arr2[3] = new Rectangle("Жёлтый", 4, 6, 10, 10);
                    arr2[4] = new Rectangle("Чёрный", 8, 3, 20, 20);

                    for (int i = 0; i < arr2.length; i++) {
                        arr2[i].calculateArea();
                        arr2[i].calculatePerimeter();
                        System.out.println();
                    }


                    break;
                case 4:
                    Car car = new Car("bmw", 2001, 340);
                    Plane plane = new Plane("Belavia", 2023, 450);

                    car.move();
                    car.move(100);
                    car.move("Slutsk");

                    System.out.println(car.getSpeed());
                    System.out.println(plane.getSpeed());


                    Vehicle cr = new Car("opel", 2004, 34);
                    Vehicle pl = new Plane("Bel", 2030, 450);
                    System.out.println(cr.getSpeed());
                    System.out.println(pl.getSpeed());

                    cr.move();
                    cr.move("Brest");
                    cr.move(335);


                    break;
                case 5:
                    Warehouse warehouse = new Warehouse();

                    try {

                        warehouse.addProduct(new Product("Ноутбук", 50000, 10, "Электроника"));
                        warehouse.addProduct(new Product("Мышка", 1000, 20, "Аксессуары"));
                        warehouse.addProduct(new Product("Клавиатура", 2500, 15, "Аксессуары"));

                        System.out.println("Товары на складе:");
                        warehouse.showProducts();

                        System.out.println("\nПокупка:");
                        warehouse.buyProduct("Мышка", 2);
                        Product laptop = warehouse.findProduct("Ноутбук");
                        laptop.increasePrice(10);

                        System.out.println("\nПосле обновления:");
                        warehouse.showProducts();

                        System.out.println("\nПроверка ошибок:");
                        try {
                            warehouse.buyProduct("Телефон", 1);
                        } catch (ProductNotFoundException e) {
                            System.out.println(e.getMessage());
                        }

                        try {
                            warehouse.buyProduct("Мышка", 100);
                        } catch (ProductNotFoundException | OutOfStockException e) {
                            System.out.println(e.getMessage());
                        }

                        try {
                            new Product("Монитор", -100, 5, "Электроника");
                        } catch (InvalidPriceException e) {
                            System.out.println(e.getMessage());
                        }

                    } catch (InvalidPriceException |
                             ProductNotFoundException |
                             OutOfStockException e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;
                default:
                    in.close();
                    return;
            }
        }


    }
}