import java.util.Scanner;

public class h_Volume_of_cuboid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of Cuboid:");
        double l = sc.nextDouble();
        System.out.println("Enter Breadth of Cuboid:");
        double b = sc.nextDouble();
        System.out.println("Enter Height of Cuboid:");
        double h = sc.nextDouble();
        double vol = (l * b * h);
        System.out.println("The Volume of Cuboid = " + vol + " ut.cb.");

        sc.close();

    }

}
