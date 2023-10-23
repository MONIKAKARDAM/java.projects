import java.util.*;

// Factorial of the User input number

public class factorial_fun {

    static void fact(int num){
        int f=1;
        for(int i=1; i<=num;i++){
            f=f*i;
        }
        System.out.println("The result of factorial is:"+f);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n=sc.nextInt();
        fact(n);
        sc.close();
    }
} 
    

