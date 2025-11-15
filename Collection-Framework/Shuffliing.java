import java.util.*;
public class Shuffliing{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Eneter Array: ");
        for(int i=0;i<=5;i++){
            int arr = sc.nextInt();
            list.add(arr);
        }
        Collections.shuffle(list);
        System.out.println("After shuffling: ");
        for(int a : list){
            System.out.print(a+ " ");
        }

    }

}