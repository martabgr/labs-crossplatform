import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(){
        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.println("Выберите номер задания 1 или 2");

            int choice = in.nextInt();
            in.nextLine();
            switch (choice) {
                case 1://последний символ в строке
                    System.out.println("Введите строку");
                    String str=in.nextLine();
                    int str2=str.length()-1;
                    System.out.println(str.charAt(str2));
                    break;
                case 2://самое короткое слово в предложении
                    System.out.println("Введите строку");
                    String str3=in.nextLine();
                    String[] words = str3.split(" ");
                    String answ=words[0];
                    for(int i=0;i<words.length;i++){
                        if(words[i].length()<answ.length()){
                            answ=words[i];
                        }
                    }
                    System.out.println("Самое короткое слово: "+answ);
                    break;
                case 3:
                    Employee []empl=new Employee[4];
                    empl[0]=new Employee("Tolik",500.0);
                    empl[1]=new Employee("Temka",1233);
                    empl[2]=new Employee("Artemchik",3456789);
                    empl[3]=new Employee("Alenka",34567890);

                    Report.generateReport(empl);
                  break;
                case 4:
//                    Дана строка 'aAXa aeffa aGha aza ax23a a3sSa'. Найти и вывести
//                    строки следующего вида: по краям стоят буквы 'a', а между ними - маленькие
//                    латинские буквы и цифры, не затронув остальных.
                    System.out.println("Введите строку");
                    String s=in.nextLine();
                    String reg="a[a-z0-9]+a";
                    Pattern pattern=Pattern.compile(reg);
                    Matcher matcher=pattern.matcher(s);
                    boolean res=matcher.matches();
                    System.out.println(res);
                    break;
                default:
                    in.close();
                    return;
            }
        }

    }
}
