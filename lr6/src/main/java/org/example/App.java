package org.example;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите номер задания 1 - 6 лаба,2 - 7 лаба");

            int choice = in.nextInt();
            in.nextLine();
            switch (choice) {
                case 1:
                    Ticket tk = new Ticket("Svadba", 12, 130);
                    tk.applyDiscount(15);


                    break;
                case 2:
                    Student a = new Student("Tolik", 3, 234);
                    Student b = new Student("Oleg", 3, 244);
                    Student c = new Student("Vitalik", 3, 349);
                    Student d = new Student("Shlepa", 2, 245);
                    Student e = new Student("Marusya", 1, 345);
                    Student f = new Student("Akakii", 4, 678);

                    System.out.println("Статистика: " + Student.getAverageCourse());

                    break;
                case 3:

                    break;
                default:
                    in.close();
                    return;
            }
        }


    }
}
