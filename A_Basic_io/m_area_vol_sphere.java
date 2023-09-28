import java.util.Scanner;

public class m_area_vol_sphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius:");
        double r = sc.nextDouble();
        double vol = (4/3) * 3.14 *(Math.pow(r,3));
        double area = 4 * 3.14 * (Math.pow(r, 2));
        System.out.println("The vol = " + vol);
        System.out.println("The area = " + area);
        sc.close();
    }
    
}
