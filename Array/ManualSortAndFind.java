import java.util.*;
public class ManualSortAndFind{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Eneter array size: ");
        int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.print("Enter array element: ");
            for(int i=0;i<arr.length;i++){
                arr[i] = sc.nextInt();

            }

            for(int i=0;i<arr.length-1;i++){
                for(int j=0;j<arr.length-i-1;j++){
                    if(arr[j]>arr[j+1]){
                        int temp = arr[j];
                        arr[j] =arr[j+1];
                        arr[j+1] =temp;
                    }
                }
            }
            System.out.print("Enter target: ");
            int target = sc.nextInt();

            int index =-1;
            for(int i=0;i<n;i++){
                if(arr[i]==target){
                    index =i;
                    break;
                }
            }
            if(index !=-1){
                System.out.println("Target found: "+ target);
            }else{
                System.out.println("Target not found :  "+ target);
            }

    }
}