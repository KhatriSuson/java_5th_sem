package O_This_KeyWord;

class StuDemo {
    int roll;
    String name, course;
    float marks;

    StuDemo(int r, String n, String course) {
        this.roll = r;
        this.name = n;
        this.course = course;
    }

    StuDemo(int roll, String name, String course, float marks) {
        this(roll, name, course);  // resuse of constructor using this keyword

        this.marks = marks;
    }

    void displayDetails() {
        System.out.println("Roll No: " + roll);
        System.out.println("Name = " + name);
        System.out.println("Course = " +course);
        System.out.println("Marks = " + marks);
    }
}

public class e_this_current_class_constructor {
    public static void main(String[] args) {
        StuDemo s1 = new StuDemo(001, "John", "BICT");
        StuDemo s3 = new StuDemo(003, "Jack", "MIT ", 90);

        s1.displayDetails();
        s3.displayDetails();

    }
}



// OUTPUT

// Roll No: 1
// Name = John
// Course = BICT
// Marks = 0.0
// Roll No: 3
// Name = Jack
// Course = MIT
// Marks = 90.0