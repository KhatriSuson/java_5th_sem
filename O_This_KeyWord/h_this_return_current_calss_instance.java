package O_This_KeyWord;

class Person {
    Person hi() {
        return this;
    }

    void hello() {
        System.out.println("Hello Sanothimi");
    }

}

public class h_this_return_current_calss_instance {
    public static void main(String[] args) {
        new Person().hi().hello();
    }
}


// OUTPUT
// Hello Sanothimi