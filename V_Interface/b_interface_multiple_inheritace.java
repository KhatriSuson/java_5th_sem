package V_Interface;
interface ITeacher{
    public void teach();
}

interface IStudent{
    public void learn();
}

class College implements ITeacher, IStudent{
    @Override
    public void teach(){
        System.out.println("Teacher is teaching");
    }

    public void learn(){
        System.out.println("Student is learning.");
    }


}
public class b_interface_multiple_inheritace {

    public static void main(String[] args) {
        College obj = new College();
        obj.teach();
        obj.learn();
    }
}
