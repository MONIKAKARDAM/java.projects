import java.util.Scanner;

public class salary{
    public static void main(String[] args) {
        System.out.println("Enter the salary");
        Scanner scan = new Scanner(System.in);
        float salary=scan.nextFloat();
        float hra=salary*30/100;
        float ta=salary*20/100;
        float da=salary*10/100;
        int pf=1500;

        float net_salary = salary +hra+ta+da-pf;
         
        System.out.println("salary:"+salary);
        System.out.println("hra:"+hra);
        System.out.println("ta:"+ta);
        System.out.println("da:"+da);
        System.out.println("Net salary " +net_salary);
        scan.close();

        
    }
}
