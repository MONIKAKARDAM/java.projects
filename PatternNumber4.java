public class PatternNumber4 {
        public static void main(String args[]) {
            int n = 5;
            //Loop to iterate over each row
            for(int i=1;i<=n;i++){
                //Loop to iterate over each column of the ith row
                for(int j=1;j<=i;j++){
                    System.out.print(i+ " "); 
                }
                System.out.println();
            }
        }
    }
    

