import java.util.Scanner;

public class f_simple_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Principal :");
        double principal=sc.nextDouble();
        System.out.println("Enter Time:");
        double time=sc.nextDouble();
        System.out.println("Enter Rate:");
        double rate=sc.nextDouble();
        double simpleInterest=(principal*time)*rate/100 ;
        System.out.println("Tne Simple Intrest = " + simpleInterest);
        sc.close();
        
    }
}
