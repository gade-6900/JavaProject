class A{
    void show(){
        System.out.println("A");
    }
}
class B extends A{
    void show(){
        System.out.println("B");

    }
}
class c extends B{
    void show(){
        System.out.println("C");
    }
}
//java does not support to the multiple inheritance
class D extends A  {
    void show(){
        System.out.println(" I am Showing  from D");
    }
}

public class MultipleInheritance{
    public static void main(String[] args) {
        D obj = new D ();
        obj.show();
        //
    }
}