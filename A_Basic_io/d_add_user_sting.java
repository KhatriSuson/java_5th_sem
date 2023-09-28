import java.util.Scanner;

public class d_add_user_sting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of A:");
        int a = sc.nextInt();
        System.out.println("Enter Value of B:");
        int b = sc.nextInt();

        int sum = 0;
        sum = a + b;
        System.out.println("The sum of two number = "  + sum);
        sc.close();
    }
    
}
