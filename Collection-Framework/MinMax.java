import java.util.*;
public class MinMax{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(500);
        list.add(600);
        list.add(1000);
        list.add(2000);

        System.out.println("Max: " + Collections.max(list));
        System.out.println("Min: "+ Collections.min(list));


    }
}