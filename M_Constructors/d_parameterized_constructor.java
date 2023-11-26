package M_Constructors;

public class d_parameterized_constructor {
    d_parameterized_constructor() {
        System.out.println("Default contructor is invoked.");
    }

    d_parameterized_constructor(int a) {
        System.out.println("A single integer parameter is passed.");
        System.out.println("The value is " + a);
    }

    d_parameterized_constructor(int a, int b) {
        System.out.println("Two integerd parameter is passed.");
        System.out.println("\nThe value of a = " + a + "\nand the value of b = " + b);
    }

    d_parameterized_constructor(int a, String b) {
        System.out.println("An Integer and string parameters are passed.");
    }

    public static void main(String[] args) {
        /*
         * d_parameterized_constructor obj1 = new d_parameterized_constructor();
         * d_parameterized_constructor obj2 = new d_parameterized_constructor(24);
         * d_parameterized_constructor obj3 = new d_parameterized_constructor(45,78);
         * d_parameterized_constructor obj4 = new d_parameterized_constructor(67,
         * "Ram");
         */

        new d_parameterized_constructor();
        new d_parameterized_constructor(234);
        new d_parameterized_constructor(100, 56789);
        new d_parameterized_constructor(45, "John");

    }

}

// output
// Default contructor is invoked.
// A single integer parameter is passed.
// The value is 234
// Two integerd parameter is passed.

// The value of a = 100
// and the value of b = 56789
// An Integer and string parameters are passed.