package C_Control_Statement.e_others;

import java.util.Scanner;

public class a_ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number either 1 or other numbers :");
        int checker = sc.nextInt();
        int result = (checker == 1) ? 10: 20;
        System.out.println("The result = " +result);
        sc.close();
    }
}
