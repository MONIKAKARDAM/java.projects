import java.util.Scanner;

public class sq_fun {

    static void square(int num) {
        for (int i = 1; i < num; ++i) {
            int p = i * i;
            if (p == num) {
                System.out.println("Square root of the given number is : " + i + " -> [It is a perfect square]");
                break;
            }
            if (p > num) {
                System.out.println(
                        "The Approx Square root of the given number is: " + i + " -> [It is Not a perfect square]");
                break;
            }
        }
    }

    public static void main(String args[]) {
        System.out.println("Enter the Number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        square(n);
        sc.close();
} 
}
 
    

