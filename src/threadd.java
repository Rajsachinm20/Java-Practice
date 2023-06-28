class ninjass extends Thread{
    private String message;
    public ninjass(String message){
        this.message=message;
    }
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println(message);
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class threadd {
    public static void main(String[] args) {
        ninjass ni=new ninjass("hello ninjas from thread 1");
        ninjass nm=new ninjass("hello ninjas from thread 2");
        ni.start();
        nm.start();
    }
}
