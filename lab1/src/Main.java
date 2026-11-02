import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(){

        while(true) {
            System.out.println("Выберите номер задания");
            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Задание 1");
                    System.out.println("Введите 1 число");
                    int a = in.nextInt();
                    System.out.println("Введите 2 число");
                    int b = in.nextInt();
                    int c = a + b;
                    System.out.printf("Ответ: %d", c);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Задание 2");
                    System.out.println("Введите целое число");
                    int num = in.nextInt();
                    if (num < 0) {
                        System.out.printf("Модуль числа: %d", -num);

                    } else {
                        System.out.printf("Модуль числа: %d", num);
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Задание 3");
//                    for (int i = 2; i <= 100; i++) {
//                        if (i % 2 == 0)
//                            System.out.printf("  %d", i);
//                    }
                    int i=2;
                    while(i<=100){
                        if(i%2==0){
                              System.out.printf("  %d", i);}
                              i++;
                    }




                    break;
                default:
                    in.close();
                    return;
            }
        }

    }
}
