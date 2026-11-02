import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(){
        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.println("Выберите номер задания 1 или 2");

            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    int[] arr=new int[10];
                    int sum=0;
                    for(int i=0;i<arr.length;i++){
                        arr[i]=(int)(Math.random()*10)-21;

                        sum+=arr[i];
                    }

                    for(int i=0;i<arr.length;i++)
                        System.out.print(arr[i]+" ");

                    System.out.println("sum= "+sum);
                    break;
                case 2:
                    int sum3=0;

                    System.out.println("введите кол-во строк+столбцов в квадратной мастрице");
                    int n=in.nextInt();

                    int[][] arr3=new int[n][n];

                    for(int i=0;i<arr3.length;i++)
                        for(int j=0;j<arr3[i].length;j++)
                            arr3[i][j]=(int)(Math.random()*100)+1;

                    for(int i=0;i<arr3.length;i++){
                        for(int j=0;j<arr3[i].length;j++)
                            System.out.print(arr3[i][j]+" ");
                        System.out.println();
                    }
                    for(int i=0;i<arr3.length;i++){
                        for(int j=0;j<arr3[i].length;j++){
                            if(j==n-1-i)
                                sum3+=arr3[i][j];
                        }
                    }
                    System.out.println("сумма: "+sum3);
                    break;
                default:
                    in.close();
                    return;
            }
        }

    }
}
