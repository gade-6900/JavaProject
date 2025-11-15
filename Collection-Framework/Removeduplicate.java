import java.util.*;
public class Removeduplicate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       Set<Integer> list = new HashSet<>();
      

        System.out.println("Enter number: ");
        for(int i=0;i<=5;i++){
            int ac = sc.nextInt();
            list.add(ac);
        }
        // Collections.set(list); 
          
        System.out.println("Removed Duplicate: ");
        for(int a:list){
            System.out.print(a+ " ");
    }
    }
}