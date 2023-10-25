import java.util.*;

// Grading System for students to calculate grades of the three subject marks

public class Grading_fun{
    static double Calc(double c, double p, double m) {
        System.out.println("Enterd  marks of chemistry is: " + c);
        System.out.println("Enterd  marks of physics is: " + p);
        System.out.println("Enterd  marks of maths is: " + m);
        double avg = (double) (c + p + m) / 3;
        return avg;
    }

    static void Display(double avg) {
        if ((avg < 100 && avg > 80)) {
            System.out.print("\nGrade A+ ");
        } else if ((avg < 80 && avg > 70)) {
            System.out.println("\n Grade B+");
        } else if ((avg < 70 && avg > 60)) {
            System.out.println("\n Grade c+");
        } else if ((avg < 60 && avg > 50)) {
            System.out.println("\n Grade D+");
        } else if ((avg < 50 && avg > 40)) {
            System.out.println("\n Grade E+");
        } else {
            System.out.println("\n Grade Fail");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the marks of Chemistry Physics Maths");
        Scanner sc = new Scanner(System.in);
        double chem = sc.nextDouble();
        double phy = sc.nextDouble();
        double maths = sc.nextDouble();
        double a = Calc(chem, phy, maths);
        System.out.printf("%-10f", a);
        Display(a);
        sc.close();
}
}
 
    

