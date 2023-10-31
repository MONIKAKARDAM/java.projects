 import java.util.*;




public class Positive_negative {
   static void number(int num){
        if (num > 0) {
            System.out.println("The Number "+num+" is positive");
            } else if (num < 0) {
                System.out.println("The Number "+num+" is negative");
                }else{
                    System.out.println("The Number "+num+" is zero");
                    }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        number(n);
        sc.close(); 
    }

    
}
