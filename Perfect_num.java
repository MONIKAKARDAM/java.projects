import java.util.Scanner;

public class Perfect_num {
    public static void main(String[]args){
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int s=0;
        long n=sc.nextInt();
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                s=s+i;

            }
        }
        if(s==n)
        {
            System.out.println("perfect number");
        }
        else
        {
            System.out.println("not perfect number");
        }

    }
}
