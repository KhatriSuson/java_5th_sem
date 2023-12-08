package T_Polymorphism.Method_Overloading;


class Calc{
    public void display(int a){
        System.out.println("The value of a = " +a);
    }

    public void display(int a, int b){
        System.out.println("The sum of a and b = " +(a+b));
    }

    public void display(int a, int b, int c){
        System.out.println("The sum of a + b + c is = " +(a+b+c));
    }
}
public class a_method_overloadingdiff_no_of_param {
    public static void main(String[] args) {
        Calc obj = new Calc();
        obj.display(5);
        obj.display(23, 22);
        obj.display(23, 12, 65);
    }
}