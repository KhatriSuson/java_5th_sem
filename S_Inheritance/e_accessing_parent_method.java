package S_Inheritance;


class Teacher {
    public void study() {
        System.out.println("Teacher is studying");
    }
}

class Student extends Teacher {
    public void study() {
        super.study();
        System.out.println("Student is studying");
    }
}
public class e_accessing_parent_method {
    public static void main(String[] args) {
        Student s = new Student();
        s.study();
    }
}


// OUTPUT
// Teacher is studying
// Student is studying