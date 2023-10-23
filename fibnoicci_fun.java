 import java.util.*;

// Print the Fibonacci_Series upto the user input number

public class fibnoicci_fun{

    static void fib_c(int num, int a, int b) {
        System.out.print(a + "," + b + ",");
        int c;
        for (int i = 0; i < num - 2; i++) {
            c = a + b;
            System.out.print(c + ",");
            a = b;
            b = c;
        }
    }

    public static void main(String args[]) {
        System.out.println("Enter the number upto you want your series");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        fib_c(n, a, b);
        sc.close();
}
}
 
    

