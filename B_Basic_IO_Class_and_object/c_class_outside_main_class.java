package B_Basic_IO_Class_and_object;
class Student {
    int roll = 5;
    String name = "Ram Rai";

}
public class c_class_outside_main_class {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("Name : " +s1.name);
        System.out.println("Roll No: " +s1.roll);
    }
    
}
