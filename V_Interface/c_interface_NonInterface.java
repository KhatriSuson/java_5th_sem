package V_Interface;

interface Ifather {
    public void teaching();

}

interface Imohter {
    public void feeding();
}

class Home {
    public void sheltering() {
        System.out.println("Home is beautiful.");
    }
}

public class c_interface_NonInterface extends Home implements Ifather, Imohter {
    public static void main(String[] args) {
        c_interface_NonInterface c = new c_interface_NonInterface();
        c.teaching();
        c.feeding();
        c.sheltering();
    }

    @Override
    public void teaching(){
        System.out.println("Father is teaching.");
    }

    public void feeding(){
        System.out.println("Mother is feeding.");
    }


}


// OUTPUT
// Father is teaching.
// Mother is feeding.
// Home is beautiful.