package O_This_KeyWord;

class Student {
    int roll;
    String name;
    float marks;

    Student(int roll, String name, float marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;

    }

    void displayDetails() {
        System.out.println("\n Roll = " + roll);
        System.out.println("Name = " + name);
        System.out.println("\n Marks = " + marks);
    }
}

public class a_this_current_class_intance_variable {
    public static void main(String[] args) {
        Student s1 = new Student(12, "JOhn", 45.5f);
        Student s2 = new Student(13, "Alix", 32.3f);

        s1.displayDetails();
        s2.displayDetails();
    }
}


// OUTPUT

//  Roll = 12
// Name = JOhn

//  Marks = 45.5

//  Roll = 13
// Name = Alix

//  Marks = 32.3