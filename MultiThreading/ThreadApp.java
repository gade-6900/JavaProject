
import java.io.InterruptedIOException;

class J extends Thread{

    public void run(){

        try{
            for(int i=1;i<=50;i++){
                System.out.println("First Thread "  + i);
                Thread.sleep(1000);
            }

        }
        catch(InterruptedException ex){
            System.out.print("Error is : "+ ex);
        }
    }
}
class K extends Thread{
    public void run(){
        try{
            for(int i=1;i<=50;i++){
                System.out.println("Second thread " + i);
                Thread.sleep(1000);
            }

        }
        catch(InterruptedException ex){
            System.out.println("Error is: "+ ex);
        }
    }
}
public class ThreadApp{
    public static void main(String args[]){

        J j1 = new J();
        j1.start();

        K k1 = new K();
        k1.start();

    }
}