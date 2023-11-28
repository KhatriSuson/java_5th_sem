package O_This_KeyWord;

class Calc {
    Calc() {
        this(34);
        System.out.println("Default constructor invoked");
    }

    Calc(int a) {
        System.out.println("The value = " + a);
    }
}

public class d_this_current_class_constructor {
    public static void main(String[] args) {
        new Calc(); // calling the default constructor of Calc class
    }
}


// OUTPUT 
// The value = 34
// Default constructor invoked
