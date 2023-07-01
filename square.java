class square1{
    int length;
    public square1(){
        this.length=10;
    }
    public square1(int l){
        this.length=1;
    }
    public int printarea(){
        return length*length;
    }
}
public class square {
    public static void main(String[] args) {
        square1 obj=new square1();
        square1 obj2=new square1(7);
        System.out.println(obj.printarea());
        System.out.println(obj2.printarea());

    }
}
