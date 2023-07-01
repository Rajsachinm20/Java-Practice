class vehicles {
    public void drive(){
        System.out.println("repairing a vehicle");
    }
}
class car extends vehicle{
    public void drive(){
        System.out.println("repairing a car");
    }
}
public class vehicle {
    public static void main(String[] args) {
        vehicles v=new vehicles();
        car c=new car();
        v.drive();
        c.drive();

    }
}
