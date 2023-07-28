package practice;
class Rectangle{
    private int length;
    private int breadth;
    public Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public int length(){
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    public int getArea(){
        return length*breadth;
    }
    public int getPerimeter(){
        return 2*(length+breadth);
    }
}
public class area_of_rectangle {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(2,4);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        r1.setBreadth(5);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());


    }
}
