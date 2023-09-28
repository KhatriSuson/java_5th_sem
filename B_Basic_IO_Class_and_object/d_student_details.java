package B_Basic_IO_Class_and_object;

class Stud {
    int roll, age;
    String name, address;

    void inputData(int r, int a, String n, String add) {
        roll = r;
        age  = a;
        name = n;
        address = add;

    }

    void displayData(){
        System.out.println("Name =" +name);
        System.out.println("Age =" +age);
        System.out.println("Address =" +address);
        System.out.println("Roll =" +roll);
    }
}
public class d_student_details {
    public static void main(String[] args) {
        Stud obj = new Stud();
        obj.inputData(45, 21, "Suson", "bkt");
        obj.displayData();
    }
    
}
