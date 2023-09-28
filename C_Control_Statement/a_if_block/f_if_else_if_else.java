package C_Control_Statement.a_if_block;

import java.util.Scanner;

public class f_if_else_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any nuber to check +ve, -ve, and zero");
        int num = sc.nextInt();
        if(num > 0){
            System.out.println("The number is positive");
        }
        else if(num < 0){
            System.out.println("The number is negative");
        }
        else{
            System.out.println("The number is equal to zero");
        }
        
    }
    
}
