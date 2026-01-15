import java.util.Scanner;
public class RotateByOne{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int temp = arr[n-1];

        for(int i=n-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        System.out.print("array afte rotate: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }

    }
}