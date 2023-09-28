import java.util.Scanner;

public class c_input_user_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name: ");
        String name = sc.next();

        System.out.println("Enter Your Phone: ");
        int phone = sc.nextInt();

        System.out.println("YOur name is " + name);
        System.out.println("YOur name is " + phone);
        sc.close();

    }
}
