import java.util.Scanner;

public class o_area_of_triangel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base of triangle:");
        float base = sc.nextFloat();
        System.out.println("Enter height of triangel:");
        float height = sc.nextFloat();
        float area = (float) (0.5 * base * height);
        System.out.println("The area of triangle = " +area);
        sc.close();
    }
    
}
