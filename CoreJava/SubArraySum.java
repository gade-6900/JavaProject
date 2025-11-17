import java.util.*;
public class SubArraySum{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Array elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int target =33;
        int curruntSum=0;
        int start=0;
        int end=0;
        boolean found = false;


        while(end<arr.length){
            curruntSum = curruntSum + arr[end];

            while(curruntSum>target){
                curruntSum = curruntSum - arr[start];
                start++;
            }
            if(curruntSum == target){
                found = true;
                System.out.println("subarray found: "+ target + "  :");
            for(int i =start;i<=end;i++){
                System.out.print(arr[i]+ " ");
            }
            found = true;
            break;
            }
            end++;
        }
        if(!found){
            System.out.println("not found the value: "+ target);
        }
    }
}