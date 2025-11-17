
import java.util.*;

public class Q8{
    public static void main(String[] args) {
        String paragraph = "Java makes coding fun and easy";

        String[] words = paragraph.split(" ");
        HashMap<Integer, ArrayList<String>> map = new HashMap<>();

        for (String word : words) {
            int length = word.length();
            if (!map.containsKey(length)) {
                map.put(length, new ArrayList<String>());
            }

            
            map.get(length).add(word);
        }

       
        TreeMap<Integer, ArrayList<String>> sortedMap = new TreeMap<>(map);

        for (Map.Entry<Integer, ArrayList<String>> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
