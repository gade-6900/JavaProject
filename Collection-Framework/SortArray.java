import java.util.*;
public class SortArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter Array: ");
        for(int i=0;i<=5;i++){
            int ar = sc.nextInt();
            list.add(ar);
        }
        Collections.sort(list);
        System.out.println("Ascending order sorted : ");
        for(int a : list){
            System.out.print(a + " ");
            
        }
        
        Collections.sort(list,Collections.reverseOrder());
        System.out.println();
        System.out.println("desending order: ");
        for(int b : list){
            System.out.print(b+ " ");
        }
    }
}