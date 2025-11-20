import java.util.*;
public class DeleteAnElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =5;
        int[] arr = new int[n];
        System.out.print("Enter array elemts: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("which position you have to delete: ");
        int pos =sc.nextInt();

        if(pos <1 || pos > n){
            System.out.println("Invalid position: ");
            return;
        }
        for(int i=pos-1;i<n-1;i++){
            arr[i] = arr[i+1];
        }
        for(int i=0;i<n-1;i++){
            System.out.print(arr[i]+" ");
        }


    }
}