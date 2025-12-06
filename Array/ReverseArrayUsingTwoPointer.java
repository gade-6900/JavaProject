import java.util.*;
public class ReverseArrayUsingTwoPointer{
    public static void main(String aargs[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter aray elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i] =sc.nextInt();
        }

        int left =0;
        int right = arr.length-1;
        while (left<right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp; 
            left++;
            right--;
            
        }
        System.out.print("After reversed: ");

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }


    }

}