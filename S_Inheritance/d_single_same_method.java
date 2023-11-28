package S_Inheritance;


class BaseClass {
    public void hi() {
        System.out.println("Hi, this is the method of base class.");
    }
}

class DeriveClass {
    public void hi() {
        System.out.println("Hi, this is the method of derived class.");
    }
}
public class d_single_same_method {
    public static void main(String[] args) {
        BaseClass b1 = new BaseClass();
        b1.hi(); // 调用base类的方法
        DeriveClass d2 = new DeriveClass();
        d2.hi();
    }
}


// OUTPUT
// Hi, this is the method of base class.
// Hi, this is the method of derived class.