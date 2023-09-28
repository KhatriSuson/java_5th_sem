import java.util.Scanner;

public class e_area_of_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter R:");
        double r = sc.nextDouble();
        double area = 3.14 * r * r;
        System.out.println("The area of circle is = " + area);
        sc.close();
    }
    
}
