package C_Control_Statement.a_if_block;

import java.util.Scanner;

public class h_display_percentage_division {
    public static void main(String[] args) {
        double nep, eng, math, sci, pop, total;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of Nepali:");
        nep = sc.nextDouble();
        System.out.println("Enter marks of English:");
        eng = sc.nextDouble();
        System.out.println("Enter marks of Maths:");
        math = sc.nextDouble();
        System.out.println("Enter marks of Science:");
        sci = sc.nextDouble();
        System.out.println("Enter marks of Population:");
        pop = sc.nextDouble();

        sc.close();

        total = nep + eng + math + sci + pop;
        System.out.println("The total obtain marks = " +total);

        if(nep>31 && eng>31 && math>31 && sci>31 && pop>31){
            double per = total/5;
            System.out.println("Percentage = " +per);

            if(per>=80){
                System.out.println("Distinction");
            }
            else if(per>=60){
                System.out.println("First Division");
            }
            else if(per>=45){
                System.out.println("Second Devision");
            }
            else if(per>=32){
                System.out.println("Third Division");


            }
            else{
                System.out.println("Better luck next time");
            }
        }

    }

}
