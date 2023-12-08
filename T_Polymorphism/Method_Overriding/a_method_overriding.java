package T_Polymorphism.Method_Overriding;

class Mom {
    public void cooking(){
        System.out.println("Mom is cooking meal");
    }

}
class Daughter extends Mom{
    @Override
    public void cooking(){
        System.out.println("Daughter is cooking meal");
    }
}

public class a_method_overriding {
    public static void main(String[] args) {
        Daughter daughter = new Daughter();
        daughter.cooking();
    }
}
