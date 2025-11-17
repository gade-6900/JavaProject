import java.util.*;

public class Q1 {
    public static void main(String[] args) {   
        Map<Integer, String> map = new HashMap<>();

       
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");
        map.put(4, "Python"); 
        map.put(null, "NullKey"); 

  
        System.out.println("Map: " + map);

        System.out.println("Key 2  " + map.get(2));


        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

       
        for (Integer key : map.keySet()) {
            System.out.println(key + "  " + map.get(key));
        }

        for (String val : map.values()) {
            System.out.println("Value: " + val);
        }
    }
}
