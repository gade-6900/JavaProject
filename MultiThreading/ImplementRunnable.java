class myThread implements Runnable{
    private Thread t;
    private String threadNAme;

     myThread(String name) {
    
        threadNAme =name;
        System.out.println("Creating "+ threadNAme );
    }

public void run(){
    System.out.println("Running "+ threadNAme);
    try{
        for(int i=4;i>0;i--){
            System.out.println("Thread: "+ threadNAme + "," + i);
            Thread.sleep(500);
        }
    }
    catch(InterruptedException e){
        System.out.println("Thread "+ threadNAme+ " Interrupted");

    }
    System.out.println("Thread "+ threadNAme+ " Existing.");
}
public void start(){
    System.out.println("String "+ threadNAme);
    if(t == null){
        t = new Thread(this,threadNAme);
        t.start();
    }
 }
    
}

public class ImplementRunnable{
    public static void main(String[] args) {
        myThread t1 = new myThread("Thread1");

        t1.start();

        myThread t2 = new myThread("Thread2");
        t2.start();
        
    }
}