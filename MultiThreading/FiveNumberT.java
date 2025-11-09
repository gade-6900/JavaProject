class NumberThread extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Number : "+ i);


            try {
                Thread.sleep(500);
                
            } catch (Exception e) {
            }
        }
    }
}

public class FiveNumberT{
    public static void main(String[] args) {
        NumberThread t1 = new NumberThread();
        t1.start();
        
    }
}