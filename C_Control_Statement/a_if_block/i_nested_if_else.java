package C_Control_Statement.a_if_block;

import java.util.Scanner;

public class i_nested_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 'm' for male and 'f' for female and 'o' for other ");
        char gander = sc.next().charAt(0);
        if(gander == 'm'){
            System.out.println("You are male");
        }
        else if( gander == 'f'){
            System.out.println("Your are Female");

        }
        else if(gander == 'o'){
            System.out.println("Your gander is other ");
        }

        else{
            System.out.println("Invalid Input");
        }
        sc.close();
    }
    
}
