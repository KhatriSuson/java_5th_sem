package B_Basic_IO_Class_and_object;

import java.util.Scanner;

class Student {
    int roll, age;
    String name;

    void getdatA(Scanner sc) {
        roll = sc.nextInt();
        age = sc.nextInt();
        name = sc.next();

    }

    void display() {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Roll = " + roll);
    }
}

public class e_user_input_student_details {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The details of the student1:");
        Student obj1 = new Student();
        obj1.getdatA(sc);

        System.out.println("Enter the details of the student 2:");
        Student obj2 = new Student();
        obj2.getdatA(sc);

        System.out.println("Enter the details of the student 3:");
        Student obj3 = new Student();
        obj3.getdatA(sc);

        System.out.println("Details of the studnet 1 :");
        obj1.display();
        System.out.println("Details of Student 2 :");
        obj2.display();
        System.out.println("Details of the student 3 :");
        obj3.display();
        sc.close();
    }

}
