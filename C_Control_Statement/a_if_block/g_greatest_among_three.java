package C_Control_Statement.a_if_block;

import java.util.Scanner;

public class g_greatest_among_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        System.out.println("Enter third number:");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("The first number " + a + "  is greatest number");
        } else if (b > a && b > c) {
            System.out.println("The second number " + b + "  is greatedt number");
        } else {
            System.out.println("The third is greated number = " + c);
        }
        sc.close();
    }

}
