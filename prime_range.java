import java.util.Scanner;

public class prime_range {
    
   
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("ENTER THE STARTING NUMBER: ");
            int start = scanner.nextInt();
            System.out.println("ENTER THE ENDING NUMBER: ");
            int end = scanner.nextInt();
            for (int i = start; i <= end; i++) {
                if (isPrime(i)) {
                    System.out.print(" "+ i);
                }
            }
        }
        private static boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }
    
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
    
            return true;
        }
    }

