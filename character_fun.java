import java.util.*;

// Check wether the user input Character is vowel or not

public class character_fun{
    static void Display(char ch){
        if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            System.out.println("its is vowel: "+ch);
            }
            else{
                  System.out.println("it is not vowel it is a constant: "+ch);
            }
    }
    public static void main(String[] args) {
        System.out.println("Enter the Character");
        Scanner sc = new Scanner(System.in);
         char ch = sc.next().charAt(0);
         Display(ch);
         sc.close();
        }
}   
 
    

