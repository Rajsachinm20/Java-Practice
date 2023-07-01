class MyThreadRunnable1 implements Runnable{
    public void run(){
        int i=0;
        while (i<400){
            System.out.println("zindagi jine ka naam hai");
            i++;
        }
    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        int i=0;
        while (i<400){
            System.out.println("aao kuch din aur yahi guzar le");
            i++;
        }
    }
}
public class cwh_runnable {
    public static void main(String[] args) {
        MyThreadRunnable1 t1=new MyThreadRunnable1();
        Thread g1=new Thread(t1);

        MyThreadRunnable2 t2=new MyThreadRunnable2();
        Thread g2 = new Thread(t2);

        g1.start();
        g2.start();
    }
}
