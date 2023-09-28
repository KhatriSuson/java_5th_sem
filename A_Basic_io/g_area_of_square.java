import java.util.Scanner;

public class g_area_of_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of Square");
        int l = sc.nextInt();
        int area = l * l;
        System.out.println("The area of square is = " + area +"  ut.sq.");
        
        sc.close();

    }
    
}
