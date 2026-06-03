package StreamAPI;
@FunctionalInterface 
interface A {
    void show();    
}
public class First {
    public static void main(String[] args){
        A obj = ()-> System.out.println("I a showing ");
        obj.show();
        
    }
}
