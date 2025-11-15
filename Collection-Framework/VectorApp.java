import java.util.Vector;

public class VectorApp{
    public static void main(String args[]){
        Vector v = new Vector();
        System.out.println("Capacity of vector: "+ v.capacity());
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);
        v.add(60);


        System.err.println("size of vector: "+ v.size());
        System.out.println("capacity of vector: "+ v.capacity());
    }
}