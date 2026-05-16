package Coding_2026.May_2026;
class Singleton{ 
    private static Singleton obj = new Singleton();

private Singleton(){
System.out.println("object created");
}

public static Singleton getInstance(){
    return obj;
}
}
public class SingletonMain{
    public static void main(String[] args ){
        Singleton s1  =  Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2);
    }
}