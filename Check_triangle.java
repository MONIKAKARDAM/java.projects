import java.util.*;

// check whether the triangle is isosceles , equilateral or scalene

public class Check_triangle {
    static void check(double a, double b, double c) {
        if (a == b && b == c) {
            System.out.println("The triangle is Equilateral");
        } else if (a == b || b == c || a == c) {
            System.out.println("The triangle is Isosceles");
        } else {
            System.out.println("The triangle is Scalene");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of sides : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        check(a, b, c);
        sc.close();
    }
}
