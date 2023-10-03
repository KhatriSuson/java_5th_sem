package C_Control_Statement.c_switch;
import java.util.Scanner;

public class a_int_weekday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers from 1 to 7 to get weekday");
        int day = sc.nextInt();
        sc.close();

        switch(day){
            case 1:
            System.out.println("Sunday");
            break;

            case 2:
            System.out.println("Monday");
            break;

            case 3:
            System.out.println("Tuesday");
            break;

            case 4:
            System.out.println("Wednesday");
            break;

            case 5:
            System.out.println("Thrusday");
            break;

            case 6:
            System.out.println("Friday");
            break;

            case 7:
            System.out.println("Saturday");
            break;
            
            default:
            System.out.println("Invalid Input");
            break;

        }
    }
    
}
