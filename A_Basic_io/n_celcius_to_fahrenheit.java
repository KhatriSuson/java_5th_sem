import java.util.Scanner;

public class n_celcius_to_fahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in celcius:");
        double cel = sc.nextDouble();
        double fah = (9.0 / 5.0) * cel + 32;
        System.out.println("The conversion temperature in fahrenheit is = " +fah);
        sc.close();

    }
    
}
