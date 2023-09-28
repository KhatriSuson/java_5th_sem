import java.util.Scanner;

public class k_sum_diff_pro_div {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of A:");
        int a = sc.nextInt();
        System.out.println("Enter Value of B:");
        int b = sc.nextInt();
        int sum = a + b;
        int diff = a -b;
        int pro = a * b;
        int div = a / b;

        System.out.println("The sum of two number =" + sum);
        System.out.println("The diff of two number =" + diff);
        System.out.println("The pro of two number =" + pro);
        System.out.println("The div of two number =" + div);
    }
    
}
