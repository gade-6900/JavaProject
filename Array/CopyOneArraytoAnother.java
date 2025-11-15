import java.util.Scanner;
public class CopyOneArraytoAnother{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size: ");
        int n=sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
    
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        
    }
}