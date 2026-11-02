package org.example;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Unit test for simple App.
 */


public class AppTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.println("Выберите номер задания 1,2,3");

            int choice = in.nextInt();
            in.nextLine();
            switch (choice) {
                case 1:
                    int a=3;
                    int b=7;
                    Rectangle rectangle=new Rectangle(a,b);
                    rectangle.area(a,b);
                    rectangle.perimeter(a,b);
                    int a1=4;
                    int b1=8;
                    Rectangle rectangle1=new Rectangle(a1,b1);
                    rectangle1.area(a1,b1);
                    rectangle1.perimeter(a1,b1);
                    break;
                case 2:
                    Book[]arr=new Book[5];
                    arr[0]=new Book("Mogged","Marta",2014);
                    arr[1]=new Book("Mogged1","Marta",2000);
                    arr[2]=new Book("Mogged2","Marta",2022);
                    arr[3]=new Book("Mogged3","Marta",2026);
                    arr[4]=new Book("Mogged4","Marta",2012);
                    arr[0].old(arr);
                    arr[0].young(arr);
                    break;
                case 3:
                    Person w=new Person(Gender.FEMALE,"Anna");
                    Person m=new Person(Gender.MALE,"Tolik");
                    w.output();
                    m.output();


                    break;
                default:
                    in.close();
                    return;
            }
        }


    }
}