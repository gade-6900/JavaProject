
import java.util.HashMap;
import java.util.Map;

public class TwoSumOpt{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 15;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int need = target-arr[i];

            if(map.containsKey(need)){
                System.out.println("pair found : "+ need + " & " + arr[i]);
                System.out.println("Indexs: "+ map.get(need)+" , "+i);
            }
            map.put(arr[i], i);
        }
    }
}