 import java .util.*;

// Reverse of the given user input number

public class reverse_fun {

    static void Rev(int num){
        int re=0;
        int r=0;
        while(num > 0){
            r = num % 10;
            re = re*10 + r;
            num = num / 10;
        }
        System.out.println("The Reverse number of digits  is:" +re);
    }
    public static void main(String args[]){
        System.out.println("Enter the number to be reversed : ");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        Rev(n);
        sc.close();
}
}
 
    

