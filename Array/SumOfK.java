import java.util.Scanner;
public class SumOfK{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n =10;
        int k=4;
        int[] arr = new int[n];

        System.out.print("Enter Array element: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum=0;

        for(int i=0;i<k;i++){
            sum = sum + arr[i];
        }

        int maxSum=sum;
        for(int i=k;i<arr.length;i++){
            sum = sum + arr[i] - arr[i-k];
            if(sum>maxSum){
                maxSum = sum;
            }
        }
System.out.println("windowSilde "+ k);
System.out.println(maxSum);
    }
}