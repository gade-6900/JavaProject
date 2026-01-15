import java.util.Scanner;
public class LeftRotateByOne{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n =sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] =sc.nextInt();
        }
        int temp =arr[0];

        for(int i=0; i<n-1;i++){
            arr[i]= arr[i+1];
        }
        arr[n-1] = temp;
        System.out.print("After rotating left: ");
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }


    }
}