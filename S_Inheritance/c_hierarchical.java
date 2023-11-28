package S_Inheritance;
class Vehicle {
    public void accelerate() {
        System.out.println("I am moving toward my destination");
    }
}

class Aeroplane extends Vehicle {
    public void fly() {
        System.out.println("I am flying.");
    }
}

class Moterbike extends Vehicle {
    public void run() {
        System.out.println("I am running on road.");
    }
}

public class c_hierarchical {
    public static void main(String[] args) {
        Aeroplane Boeing474 = new Aeroplane();

        Boeing474.accelerate();
        Boeing474.fly();
        

        Moterbike Ducati = new Moterbike();
        Ducati.accelerate();
        Ducati.run();
    }
}


// OUTPUT
// I am moving toward my destination
// I am flying.
// I am moving toward my destination
// I am running on road.