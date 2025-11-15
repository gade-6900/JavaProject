interface Vehicle{
    void start();
    void stop();
}
// implimentation
class car implements  Vehicle{
     public void start(){
        System.out.println("car start with key");
     }
     public void stop(){
        System.out.println("car stop with break");
     }
}
public class InterfaceExample{
    public static void main(String args[]){
        Vehicle v1 = new car();
        v1.start();
        v1.stop();
    }

}