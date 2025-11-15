import java.util.*;
public class List{
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Vector v  = new Vector(list);
        System.out.println(v);
    }
}