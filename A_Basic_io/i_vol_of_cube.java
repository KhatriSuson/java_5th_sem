import java.util.Scanner;

public class i_vol_of_cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length:");
        float l = sc.nextFloat();
        float vol = (float) Math.pow(l, 3);
        System.out.println("The volume = " + vol + "ut.cb");
        sc.close();
    }
    
}
