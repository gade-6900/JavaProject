import java.lang.*;
 
public class Joins{
    public static void main(String args[])throws Exception {
        AROBO ar = new AROBO();
        ar.start();
        ar.join();

        BROBO br = new BROBO();
        br.start();

    }
}
class AROBO extends Thread{
    public void run(){
        try{
            System.out.println("I am feeting 4 door.");
            Thread.sleep(1000);
            System.out.println("I am feeting bumper...");
            Thread.sleep(1000);
            System.out.println("I am feeting 4 wheels...");
            Thread.sleep(1000);

        }catch(InterruptedException ex){
            System.out.println("Error is: " + ex);
        }
    }
}
class BROBO extends Thread{
    public void run(){
        try{
            System.out.println("I am painting 4 door.");
            Thread.sleep(1000);
            System.out.println("I am painting bumper..");
            Thread.sleep(1000);
            System.out.println("I am Painting 4 wheels..");
            Thread.sleep(1000);
        }catch(InterruptedException ex ){
            System.out.println("Error is: "+ ex);
        }
    }
}