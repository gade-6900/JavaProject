import java.util.*;
public class MinSumSubarray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the Array elements:  ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int k=3;
        int windowSum=0;
        int minSum;

        for(int i=0;i<k;i++){
            windowSum = windowSum + arr[i];
        }
        minSum = windowSum;

        for(int i=k;i<n;i++){
            windowSum = windowSum - arr[i-k] + arr[i];
            if(windowSum<minSum){
                minSum= windowSum;
            }
        }
        System.out.println("Minimum Sun Array size is: "+ k + " is "+ minSum);

    }
}