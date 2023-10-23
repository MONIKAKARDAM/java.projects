
import java.util.*;

public class simple_intrest_fun {

    static float calculate(float p, float r, float t) {
        return (p * r * t) / 100;
    }

    public static void main(String[] args) {
        System.out.println("Enter the Details To Clculate Simple Interest");
        Scanner sc = new Scanner(System.in);
        float principle = sc.nextFloat();
        float Rate = sc.nextFloat();
        float Time = sc.nextFloat();
        float SI = calculate(principle, Rate, Time);
        System.out.printf("The Simple Interest is %.2f", SI);
        sc.close();
}

}