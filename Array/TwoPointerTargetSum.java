import java.util.*;
public class TwoPointerTargetSum{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();

        System.out.print("Enter Target: ");
        int target = sc.nextInt();

        int[] arr = new int[size];
        System.err.print("Enter Array elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();

        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int temp =0;
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        // Arrays.sort(arr);
        // System.out.println("Sorted array: ");
        // for(int i=0;i<arr.length;i++){
        //  System.out.print(arr[i] + " ");
        // }

        int left =0;
        int right = arr.length-1;

        boolean found= false;

        while(left<right){
            int sum = arr[left]+arr[right];
            if(sum == target){
                System.out.println("Pair found: "+ arr[left] + " + "+ arr[right]+ " = " + target);
                found =true;
                left++;
                right--;
            
            }
            else if(sum<target){
                left++;
            } 
            else{
                right--;
            }

        }
        if(!found){
            System.out.println("Pair not found in the array.......");
        }
    }
}