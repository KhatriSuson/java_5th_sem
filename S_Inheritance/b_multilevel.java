package S_Inheritance;

class GrandPa {
    public void grand() {
        System.out.println("Hello, GrandPa");
    }
}

class Father extends GrandPa {
    public void father() {
        System.out.println("Hello, Father");
    }
}

class Son extends Father {
    public void child() {
        System.out.println("Greeting from your child.");
    }
}

public class b_multilevel {
    public static void main(String[] args) {
        Son obj = new Son();
        obj.grand();
        obj.father();
        obj.child();
    }
}



// OUTPUT

// Hello, GrandPa
// Hello, Father
// Greeting from your child.
