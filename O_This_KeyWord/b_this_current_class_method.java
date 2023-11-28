package O_This_KeyWord;

class Teacher {
    void hi() {
        System.out.println("Hi Sanothimi.");
    }

    void hello() {
        System.out.println("Hello Sanothini");
        this.hi();
    }
}

public class b_this_current_class_method {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.hello();
    }
}


// OUTPUT
// Hello Sanothini
// Hi Sanothimi.
