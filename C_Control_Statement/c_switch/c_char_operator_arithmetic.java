package C_Control_Statement.c_switch;

import java.util.Scanner;

public class c_char_operator_arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter Second number: ");
        double num2 = sc.nextDouble();
        System.out.println("Enter a symbol +, -, * or / to perform an arithmetic operations");
        char opt = sc.next().charAt(0);

        switch(opt){
            case '+':
            System.out.println("The sum of two number is = " + (num1+num2));
            break;

            case '-':
            System.out.println("The different of two number is = " + (num1-num2));
            break;

            case '*':
            System.out.println("The product of two number is = " + (num1*num2));
            break;

            case '/':
            System.out.println("The Quotient of two number is = " + (num1+num2));
            break;
        }
        sc.close();
        
    }
    
}
