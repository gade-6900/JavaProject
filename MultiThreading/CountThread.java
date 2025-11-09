
import java.io.IOException;

class CountdownThread extends Thread{

    public void run(){
        try {
            for(int i=1;i<=10;i++){
                System.out.println("countdown: "+ i);
                Thread.sleep(2000         );

            }
            System.out.println("countdown finished.....");
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


public class CountThread{
    public static void main(String args[]){

        CountdownThread cd = new CountdownThread();

        cd.start();

    }
}