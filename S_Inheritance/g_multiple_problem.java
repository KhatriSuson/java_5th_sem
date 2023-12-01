package S_Inheritance;

class Dad {
    public void helloSon() {
        System.out.println("Hello son, love you from your dad.");
    }
}

class Mom {
    public void hiSon() {
        System.out.println("Hi Son, I hope you are doing well");
    }
}

public class g_multiple_problem {
    public static void main(String[] args) {
        Mom m1 = new Mom();
        m1.hiSon();

        Dad d1 = new Dad();
        d1.helloSon();
    }
}
