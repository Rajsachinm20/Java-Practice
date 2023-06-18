class Ninjas extends Thread{
    private String message;
    public Ninjas(String message){
        this.message=message;
    }
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println(message);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class cwh_thread_priorities {
    public static void main(String[] args) {
        Ninjas thread=new Ninjas("I LOVE U BABY");
        thread.setName("helllo ninjas");
        System.out.println("thread name is: "+thread.getName());

        //set the priority of the thread
        thread.setPriority(Thread.MAX_PRIORITY);
        System.out.println("priority of thread is: "+thread.getPriority());

        //check if the thread is alive
        System.out.println("thread is alive: "+thread.isAlive());

        thread.start();

        try {
            //wait for the thread to finish
            thread.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        //check if the thread is alive after it has finished
        System.out.println("thead is alive: "+thread.isAlive());
    }
}
