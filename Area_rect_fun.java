 import java.util.*;



public class Area_rect_fun{

    static int area(int len,int bre){
        return len*bre;
    }
    static int perimeter(int le,int bre){
        return 2*(le+bre);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int l =sc.nextInt();
        System.out.println("Enter the Bredth: ");
        int b =sc.nextInt();
        System.out.print("Area of Rectangle : "+area(l,b));
        System.out.print("\nPerimeter of Rectangle : "+perimeter(l,b));
        sc.close();
    }
} 
    
 
    

