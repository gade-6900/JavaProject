import java.util.*;
public class CountPairLessThanSum{
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        System.out.print("enter size: ");
        int size = sc.nextInt();

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter array elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int temp =0;
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]= temp;
                }
            }
        }

        int left =0;
        int right = arr.length-1;
        int count =0;

        while(left<right){
            if(arr[left]+arr[right] < target){
                count = count + (right - left);
                left++;
            }
            else{
                right--;
            }
        }
        System.out.println("Total Pairs are : " + count);
    }
}