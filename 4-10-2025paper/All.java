
class student {   
    private String name;
    private int id;

    public String getName(){
        return name;
    }
}

class a{
    void show(){
        System.out.print("i am parent: ");
    }
}
class b extends a{
    void show(){
        System.out.println(" I am cild");
    }
}
 
 abstract class shape{
    abstract void draw();

    public void display(){
        System.out.println("this is shape..");
    }
}

class shape extends shape{
    void draw(){
        System.out.println("Draw a circle");
    }
}
public class All{
    public static void main(String[] args) {
        
    }
}
  