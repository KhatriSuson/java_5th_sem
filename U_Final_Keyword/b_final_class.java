package U_Final_Keyword;

class Super {
    void hello(){
        System.out.println("Hello from super class");
    }
}

class Sub extends Super{
    void hi(){
        System.out.println("Hi, from sub class.");
    }
}

public class b_final_class {
    public static void main(String[] args) {
        Sub obj = new Sub();
        obj.hello();
        obj.hi();
    }
}
