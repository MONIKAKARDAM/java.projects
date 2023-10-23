import java .util.*;

// Sallery slip of the employ including tax
// Using Function

public class salary_slip_fun{
    static float calculation(float s){
        float HRA= (float) (s  * 0.3);
        float DA= (float) (s * 0.2);
        int TA= 2000;
        float gross = s + HRA +DA +TA;
        return gross ;
    }

    static void check(float gross,float salery,String name){
        float tax =0;
         if(gross<=10000){
             tax = 0;
                float NEt1 =gross - tax;
                System.out.println("Name: "+name);
                System.out.println("Salery in Rupees: "+salery+" Rs");
                System.out.println("Tax on the Salery :"+tax+" Rs");
                System.out.println("THE gross of the person is :"+gross+" Rs");
                System.out.println("The net salery person got: "+NEt1+" Rs");
            }
            else if(gross>10000 && gross<=20000){
                tax =(float) (gross *0.05);
                    float NEt =gross - tax;
                    System.out.println("Name: "+name);
                    System.out.println("Salery in Rupees: "+salery+" Rs");
                    System.out.println("Tax on the Salery :"+tax+" Rs");
                    System.out.println("THE gross of the person is :"+gross+" Rs");
                    System.out.println("The net salery person got: "+NEt+" Rs");
            }else if(gross>20000 && gross<=25000){
                tax =(float) (gross *.15);
                    float NEt =gross - tax;
                    System.out.println("Name: "+name);
                    System.out.println("Salery in Rupees: "+salery+" Rs");
                    System.out.println("Tax on the Salery :"+tax+" Rs");
                    System.out.println("THE gross of the person is :"+gross+" Rs");
                    System.out.println("The net salery person got: "+NEt+" Rs");

            }else{
                tax =(float) (gross *.25);
                    float NEt =gross - tax;
                    System.out.println("Name: "+name);
                    System.out.println("Salery in Rupees: "+salery+" Rs");
                    System.out.println("Tax on the Salery :"+tax+" Rs");
                    System.out.println("THE gross of the person is :"+gross+" Rs");
                    System.out.println("The net salery person got: "+NEt+" Rs");
            }
    }
    public static void main(String[] args) {
        System.out.println("*****Enter your details****");
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your Name: ");
             String name = sc.next();
             System.out.println("Enter your Salery in Rupees: ");
            float salery =sc.nextFloat();
            // function calling
            float gross = calculation(salery);
            check(gross,salery,name);
            sc.close();
}
}
 
    

