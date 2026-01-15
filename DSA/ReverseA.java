import java.util.*;
public class ReverseA {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("enter array elements: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Before reverse: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int left = 0;
        int right = arr.length-1;

        while(left<=right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            right--;
            left++;
        }
        System.out.print("After reversed array: ");
        for(int x: arr){
            System.out.print(x+" ");
        }

    }
}
