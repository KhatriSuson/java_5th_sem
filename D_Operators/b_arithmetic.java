package D_Operators;

import java.util.Scanner;

public class b_arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();

        System.out.println("Sum = " + (num1 + num2)); // Addition arithmetic operator
        System.out.println("Sub = " + (num1 - num2)); // Subtraction arithmetic operator
        System.out.println("Mul = " + (num1 * num2)); // Multiplication arithmetic operator
        System.out.println("Div = " + (num1 / num2)); // Division arithmetic operator

        System.out.println("Exponential = " + (int)Math.pow(num1, num2));
        sc.close();

    }
    
}
