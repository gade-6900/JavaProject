class jointhread extends Thread{
    public void run(){
        for(int i=1;i<=3;i++){
            System.out.println(getName() + " -count "+ i);


            try {
                Thread.sleep(700);
                
            } catch (Exception e) {
            }
        }
    }
}

public class JT{
    public static void main(String[] args) {

        jointhread j1 = new jointhread();
        jointhread j2 = new jointhread();

        j1.setName("Thread-A");
        j2.setName("thread-b");

        j1.start();

        try {
            j1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        j2.start();
        
    }
}