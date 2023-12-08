package V_Interface;

interface Icollage {
    public void study();

}

class Student implements Icollage {
    @Override
    public void study() {
        System.out.println("WE are studing");
    }
}

public class a_interface {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.study();
    }

}
