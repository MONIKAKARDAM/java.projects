import java.util.Scanner;

public class leap{
    public static void main(String[]args){
        System.out.print("enter the year");
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        if(i%4==0){
            System.out.print("leap year");
        }else{
            System.out.print("not leap year");
            sc.close();
        }
    }
}


