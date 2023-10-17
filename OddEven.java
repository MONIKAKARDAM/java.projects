import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number to test");
		int number = scan.nextInt();
		
		scan.close();

		String result = number%2==0 ? "Even" : "Odd";

		System.out.println(number +" is "+ result);	

	}

}
