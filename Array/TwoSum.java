
import java.util.Scanner;

public class TwoSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
            if(arr[i]+arr[j]==target){
                System.err.println("Pair found: "+ arr[i]+ " & "+arr[j]);
                System.out.println("At the Index: "+ i + " & "+ j);
            }
            }
        }

    }
}