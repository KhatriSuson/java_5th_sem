package H_Variables_Constants;
class Student {
    static int clzid = 34;
    int roll;
    String name;

    void input(int r, String n){
        roll = r;
        name = n;

    }



    void output()
    {
        System.out.println("CollegeId = " +clzid);
        System.out.println("Name = " +name);
        System.out.println("Roll No: = " +roll);
    }

}

public class b_static_constants {
    public static void main(String[] args) {
      Student obj = new Student();
      obj.input(234, "Ram Rai");
      obj.output();


      Student.clzid = 21; 
      Student obj1 = new Student();
      obj1.input(43, "sita");
      obj1.output();

     Student.clzid = 12;
      Student obj2 = new Student();
      obj1.input(89, "Gita");
      obj2.output();
    }
    
}
