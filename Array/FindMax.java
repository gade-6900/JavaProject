import java.util.*;
public class FindMax{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Size: ");
        int n = sc.nextInt();

        int max =0;

        int[] arr = new int[n];
        System.out.print("Enter Array element: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Max element is : "+ max);

    }
}