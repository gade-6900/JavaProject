
import java.util.Scanner;

public class FindMissing{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int n = sc.nextInt();

        int[] arr = new int[n-1];
        System.out.print("Enter array: ");
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
        }
            int totalSum = n*(n+1)/2;
            int arraySum =0;
            for(int i=0;i<arr.length;i++){
                arraySum +=arr[i];
            }
            int missing = totalSum - arraySum;
            System.out.println("Missing elements is : " + missing);
        }
}