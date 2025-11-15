abstract class shape{
    abstract void draw();

    public void display(){
        System.out.println("this is shape..");
    }
}
class Circle extends shape{
    void draw(){
        System.out.println("Draw a circle");
    }
}
class rectangle extends shape{
    void draw(){
    System.out.println("Draw a Rectangle....");
    }
}
public class AbstarctExample{
    public static void main(String[] args) {
        
        shape s1 = new Circle();
        shape s2= new  rectangle();

        s1.display();
        s1.draw();

        s2.display();
        s2.draw();

    }
}