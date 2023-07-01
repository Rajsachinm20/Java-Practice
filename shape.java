class shapes{

    public double getArea(){
        //System.out.println(length*breadth);
        return 0.0;
    }

}
class Rectangle extends shapes{
    private double length;
    private double breadth;
    public Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public double getArea(){
        return length*breadth;
    }
}
public class shape {
    public static void main(String[] args) {
        Rectangle r=new Rectangle(3.0,4.0);
        double area=r.getArea();
        System.out.println("the area of rectangle is : "+area);

    }
}
