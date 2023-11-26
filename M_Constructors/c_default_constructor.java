package M_Constructors;

public class c_default_constructor {

    int roll;
    String name;

    c_default_constructor() {
        roll = 34;
        name = "John";

    }

    void display() {
        System.out.println("Roll :" + roll);
        System.out.println("Name = " + name);
    }

    public static void main(String[] args) {
        c_default_constructor obj1 = new c_default_constructor();
        obj1.display();
    }
}