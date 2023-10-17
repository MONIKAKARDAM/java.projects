import java.util.Scanner;
public class Temperature {
    public static void main(String[] args){
        System.out.println("Enter the temperature");
        Scanner sc =new Scanner(System.in);
        float cel=sc.nextFloat();
        float fer=(cel*9/5)+32;
        System.out.println("temperature in ferhenit"+fer);
        sc.close();
    }

    
}
