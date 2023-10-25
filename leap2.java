 import java.util.Scanner;
 
 public class leap2 {
    static boolean leap2(int year){
        
        if(year%4==0 && year !=100|| year % 400==0)
           return true;
        else
           return false;   

    }

    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the year:");
        int year = sc.nextInt();
        if(leap2(year))
           System.out.println("leap year");
        else
           System.out.println("not leap year");   

        
    }
   
}

