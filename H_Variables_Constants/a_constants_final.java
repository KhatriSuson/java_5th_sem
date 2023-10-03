package H_Variables_Constants;
class College{
    final int clzid = 23;
    void display()
    {
        System.out.println("The college id = " +clzid);
    } 
}

public class a_constants_final {
    public static void main(String[] args) {
        College obj = new College();
        obj.display();
    
}
}
