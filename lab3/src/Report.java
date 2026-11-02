public class Report {
    public static void generateReport(Employee[]empl){
        for (int i=0;i< empl.length;i++){
            System.out.printf("%-15s %30.2f",empl[i].fullname,empl[i].salary);
            System.out.println();
        }
    }
}
