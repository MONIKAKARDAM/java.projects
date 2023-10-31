import java.util.*;

public class Days_months_fun {

    static void print(int ch){
        switch (ch) {
            case 1:{
                System.out.println("1. January");
                System.out.println("2. February");
                System.out.println("3. March");
                System.out.println("4. April");
                System.out.println("5. May");
                System.out.println("6. June");
                System.out.println("7. July");
                System.out.println("8. August");
                System.out.println("9. September");
                System.out.println("10. October");
                System.out.println("11. November");
                System.out.println("12. December");
                break;
            }
            case 2: {
                System.out.println("1. Monday");
                System.out.println("2. Tuesday");
                System.out.println("3. Wednesday");
                System.out.println("4. Thursday");
                System.out.println("5. Friday");
                System.out.println("6. Saturday");
                System.out.println("7. Sunday");
                break;
            }
            default:{
                System.out.print("Invalid choice!");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Choice : \n 1. (12) Months \n 2. (7) Days");
        int choice =sc.nextInt();
        print(choice);
        sc.close();
    }

    
}
