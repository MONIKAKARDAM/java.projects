import java.util.Scanner;

public class armstrong{
	
   static int armstrong(int n) {
		int an = 0;
		while(n>0) {
			int rem = n%10;
			an+=rem*rem*rem;
			n/=10;
		}
		
		return an;
	}

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter a Number : ");
	   int n = sc.nextInt();
	   if(armstrong(n)==n) {
		   System.out.println("Yes");
	   }else {
		   System.out.println("No");
           
	   }
	}
}