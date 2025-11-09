import java.util.Scanner;
public class ReverseArr{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.err.print("size: ");
    int n = sc.nextInt();

    int[] arr = new int[n];

    System.out.print("enter elements: ");
    for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt();
    }

    System.out.print("reverse Array: ");
    for(int i=n-1;i>=0;i--){
        System.out.print(arr[i] + " ");
    }


    }
}