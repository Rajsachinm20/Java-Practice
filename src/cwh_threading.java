class MyThread1 extends Thread{
    public void run(){
        int i=0;
        while(i<4000){
            System.out.println("mu cooking thread is running");
            System.out.println("i am happy");
            i++;
        }
    }
}
class MyThread2 extends Thread{
        public void run(){
            int i=0;
            while (i<4000){
                System.out.println("i am tallking to my friends");
                System.out.println(" I am Feeling very excited");
                i++;
            }
        }
}

public class cwh_threading {
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();
        t1.start();
        t2.start();

    }
}
