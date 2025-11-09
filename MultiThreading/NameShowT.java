class MyRunnable implements  Runnable{
    public void run(){
        for(int i=1;i<=3;i++){
            System.out.println(Thread.currentThread().getName() + " -count "+ i);

            try {
                    Thread.sleep(500);                
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}


public class NameShowT{
    public static void main(String args[]){
        MyRunnable runnable = new MyRunnable();

        Thread t1 = new Thread(runnable, "Thread-one");
        Thread t2 = new Thread(runnable, "Thread-two");
        t1.start();
        t2.start();

    }
}