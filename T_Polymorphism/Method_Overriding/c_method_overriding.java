package T_Polymorphism.Method_Overriding;

class Human {
    //Overridden Method

    public void walk(){
        System.out.println("HUman walks");
    }
}


public class c_method_overriding extends Human {

    // Overridden Method
    public void walk(){
        System.out.println("Boys walks");
    }
    public static void main(String[] args) {

        Human obj = new c_method_overriding();
        Human obj2 = new Human();
        obj.walk();
        obj2.walk();
    }
    
}
