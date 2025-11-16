import java.util.*;
public class ArrayRev{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter Size: ");
	int n = sc.nextInt();
	int[] arr = new int[n];
	System.out.print("Array element: ");
	for(int i=0;i<arr.length;i++){
		arr[i] = sc.nextInt();
		}
		
		System.out.print("\nReversed Array is: ");
		for(int i=arr.length-1;i>=0;i--){
			System.out.print(arr[i]+" ");
		}
	}
}