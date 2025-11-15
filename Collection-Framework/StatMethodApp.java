
import java.util.Iterator;
import java.util.Vector;

public class StatMethodApp{
    public static void main(String arsg[]){
     
        Vector v = new Vector();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);
        v.add(60);

        Iterator i= v.iterator();
        while(i.hasNext()){
            Object obj = i.next();
            System.out.print(obj+" ");
        }

    }
}