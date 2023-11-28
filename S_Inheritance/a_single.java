package S_Inheritance;

class SuperClass {
    public void hi() {
        System.out.println("Hi, Student");
    }
}

class SubClass extends SuperClass {
    public void hello() {
        System.out.println("Hello, Students");
    }
}


public class a_single {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.hi();
        obj.hello();
    }

}

// OUTPUT
// Hi, Student
// Hello, Students