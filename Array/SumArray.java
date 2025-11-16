import java.util.*;
public class SumArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Size: ");
        int n = sc.nextInt();

        int sum=0;

        int[] arr = new int[n];

        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
                sum = sum + arr[i];
            
        }
        System.out.println(sum + " ");
    }
}