class sleepdemo extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(getName() + " -Number "+ i);

            try {
                Thread.sleep(1000);
                
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class SleepDemoT{
    public static void main(String[] args) {
        sleepdemo s = new sleepdemo();

        s.setName("sleepthread");

        s.start();
        
    }
}