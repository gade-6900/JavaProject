package TCS_NQT;
import java.util.*;
public class SongList{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Map<Integer,String>map = new HashMap<>();
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        sc.nextLine();

      
        for(int i=0;i<n;i++){
            System.out.print("key: ");
            int key = sc.nextInt();
            sc.nextLine();

            System.out.print("value: ");
            String value = sc.nextLine();

            map.put(key,value);
        }
        System.out.print("SearchID: ");
        int SearchID = sc.nextInt();

        if(map.containsKey(SearchID)){
            System.out.println(map.get(SearchID));
        }else{
            System.out.println("Not Found.");
        }

    }
}