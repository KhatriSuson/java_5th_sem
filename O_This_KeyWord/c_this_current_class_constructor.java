package O_This_KeyWord;
 
class Nums {
    Nums() {
        System.out.println("Default constructor  invoked.");
    }
    Nums(int a) {
        this();
        System.out.println("The value = " + a);
    }
}

public class c_this_current_class_constructor {
    public static void main(String[] args) {
        // Nums obj = new Nums();
        new Nums(23);
    }
}
