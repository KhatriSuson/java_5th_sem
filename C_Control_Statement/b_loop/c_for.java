package C_Control_Statement.a_if_block.b_loop.c_switch.d_jump.e_others;

import java.util.Scanner;

public class c_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for multiplication:");
        int n = sc.nextInt();
        sc.close();

        for(int i = 0; i<=10; i++){
            System.out.println(n + "*" + i + "=" + (i*n));
        }
        
        
    }
    
}
