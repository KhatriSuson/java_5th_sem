package C_Control_Statement.a_if_block;

import java.util.Scanner;

public class c_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = sc.nextInt();
        if(num > 0){
            System.out.println("The enter number is positive integer");

        }
        else{
            System.out.println("The enter number is negative");
        }
        sc.close();
    }
    
}
