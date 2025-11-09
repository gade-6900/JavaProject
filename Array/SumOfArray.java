import java.util.Scanner;
public class SumOfArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Size: ");
        int n = sc.nextInt();

        int sum=0;
        int[] arr = new int[n];
        System.err.print(" Enter Array element: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.err.println("Sum of array :" + sum);
    }
} 