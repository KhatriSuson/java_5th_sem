package M_Constructors;

public class f_copy_constructor {
    int roll;
    String name;

    // Copy constructor

    f_copy_constructor(int r, String n) {
        roll = r;
        name = n;
    }

    f_copy_constructor(f_copy_constructor stu) {
        System.out.println("\n After invoking copy construcotor:");
        roll = stu.roll;
        name = stu.name;
    }

    int displayRoll() {
        return roll;
    }

    String displayName() {
        return name;
    }

    public static void main(String[] args) {
        f_copy_constructor student1 = new f_copy_constructor(20, "John Doe");
        System.out.println("\n Roll no = " + student1.displayRoll());
        System.out.println("\n Name = " + student1.displayRoll());

        f_copy_constructor st2 = new f_copy_constructor(student1);

        System.out.println("\n Roll no = " + st2.displayName());
        System.out.println("\n Name = " + st2.displayRoll());
    }

}


// OUTPUT

//  Roll no = 20

//  Name = 20

//  After invoking copy construcotor:

//  Roll no = John Doe

//  Name = 20