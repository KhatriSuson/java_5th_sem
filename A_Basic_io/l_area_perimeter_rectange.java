import java.util.Scanner;

public class l_area_perimeter_rectange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length :");
        float l = sc.nextFloat();
        System.out.println("Enter Breadth:");
        float b = sc.nextFloat();

        float area = l * b;
        float perimeter = 2 * (l + b);
        System.out.println("The area = " + area);
        System.out.println("The perimeter = " +perimeter);
        sc.close();
    }
    
}
