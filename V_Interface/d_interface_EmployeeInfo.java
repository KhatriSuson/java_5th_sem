package V_Interface;

import java.util.Scanner;

interface IEmployee {
    public void getdata();

    public void showdata();
}


public class d_interface_EmployeeInfo implements IEmployee {
    int emp_id;
    String emp_name;

    public static void main(String[] args) {
        d_interface_EmployeeInfo obj = new d_interface_EmployeeInfo();
        obj.getdata();
        obj.showdata();
    }


    @Override

    public void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID:");
        emp_id = sc.nextInt();
        System.out.println("Enter Employee Name:");
        emp_name = sc.next();
        sc.close();
    }

    @Override
    public void showdata(){
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name =" +emp_name);
    }

}
