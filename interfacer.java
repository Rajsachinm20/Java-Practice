interface Bicycle{
    int a=45;
    void applyBrake(int decrement);
    void speedup(int increment);
}
interface blowHorn{
    void blowhornkeg();
    void blowhornmhn();
}
class AvonCycle implements Bicycle,blowHorn{
    void blowhorn(){
        System.out.println("pe pe po po");
    }

    @Override
    public void applyBrake(int decrement) {
        System.out.println("apply brake");
    }

    @Override
    public void speedup(int increment) {
        System.out.println("applying speedup");
    }
    public void blowhornkeg(){
        System.out.println("kbhi khusi kbhi gam pee pee pee pee");
    }
    public void blowhornmhn (){
        System.out.println("mai hoon naah po po po");
    }
}
public class interfacer {
    public static void main(String[] args) {
        AvonCycle sachin=new AvonCycle();
        // u can creatae properties in interfaces
        System.out.println(sachin.a);
        //u can not modify the properties in interfaces as they are final
        sachin.applyBrake(1);
        sachin.blowhornmhn();
        sachin.blowhornkeg();
    }
}
