
import java.util.Scanner;

public class menu_fun {

    static void calculate(double i, double j, int choice) {
        switch (choice) {
            case 1: {
                System.out.println("Addition is : " + (i + j));
                break;
            }
            case 2: {
                System.out.println("Subtraction is : " + (i - j));
                break;
            }
            case 3: {
                System.out.println("Multiplication is : " + (i * j));
                break;
            }
            case 4: {
                System.out.println("Division is : " + (i / j));
                break;
            }
            default: {
                System.out.println("Error! You Have Enterd Wrong Choice !....");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Choice To Perform Such Operations: \n Press 1 for Addition\n Press 2 for Subtraction \n Press 3 for Multiplication \n Press 4 for Division   ");
        int c = sc.nextInt();
        System.out.println("Enter the two numbers to perform the Specific operations: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        calculate(a, b, c);
        sc.close();
    }
}
