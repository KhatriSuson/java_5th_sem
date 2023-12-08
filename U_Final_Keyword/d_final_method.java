package U_Final_Keyword;

class Mom {
    public void eat() {
        System.out.println("Mom is eating");
    }
}

class Daughter extends Mom {
    @Override
    public void eat() {
        System.out.println("Daughter is earting banana");
    }
}

public class d_final_method {
    public static void main(String[] args) {
        Daughter obj = new Daughter();
        obj.eat();
    }

}
