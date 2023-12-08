package U_Final_Keyword;

class Teacher {
    // public final void teach()
    public void teach() {
        System.out.println("Teacher is teaching");
    }

}

public class c_final_method extends Teacher {
    @Override
    public void teach() {
        System.out.println("Student is studying");

    }

    public static void main(String[] args) {
        c_final_method c = new c_final_method();
        Teacher t1 = new Teacher();
        Teacher t2 = new c_final_method();
        t1.teach();
        t2.teach();
        c.teach();

    }

}

// OUTPUT

// Teacher is teaching
// Student is studying
// Student is studying