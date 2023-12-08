package T_Polymorphism.Method_Overloading;
class Num{
    void add(int a, double b){
        System.out.println("The sum of two number = " +(a+b));
    }

    void add(double a, int b){
        System.out.println("The sum of two num = " +(a+b));
    }
}

public class c_method_overloading_diff_sequence_of_para {
    public static void main(String[] args) {
        Num obj = new Num();
        obj.add(23.23, 43);
        obj.add(12, 12.23);
    }
}
