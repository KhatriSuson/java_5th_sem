package T_Polymorphism.Method_Overloading;

class Nums{
    int sum(int a, int b){
        return(a+b);
    }

    double sum(double x, double y){
        return(x + y);
    }
}

public class b_method_overloading__diff_data_types{
    public static void main(String[] args) {
        Nums obj = new Nums();
        int sum1 = obj.sum(12, 34);
        double sum2 = obj.sum(23.23, 34.2332);

        System.out.println("The sum of integer = " + sum1);
        System.out.println("The sum of double = "+ sum2);

        
    }
}