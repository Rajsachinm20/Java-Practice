class A{
    public int a;
    public int sachin(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}
class B extends A{
    public void meth2(){
        System.out.println("i am method 2 of class b");
    }
    public void meth3(){
        System.out.println("i am me");
    }
}
public class ppractice {
    public static void main(String[] args) {
        A obj=new A();
        obj.meth2();

        B b=new B();
        b.meth2();


    }
}
