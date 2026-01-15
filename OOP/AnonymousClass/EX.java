interface Greeting{
    void sayHello();
}
public class EX{
    public static void main(String args[]){
        Greeting g = new Greeting(){
            public void sayHello(){
                System.out.print("Hello from Anonymous class");
            }
        };
        g.sayHello();
    }
}