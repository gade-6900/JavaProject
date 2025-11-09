import java.util.Scanner;

public class LongestConsecutivesequence{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the lsize of the Array: ");
	int n = sc.nextInt();
	int[] arr = new int[n];
	
	System.out.print("Enter Array elements: ");
	for(int i = 0; i<arr.length;i++){
		arr[i]= sc.nextInt();
		System.out.print(arr[i] + " ");	
	}
	System.out.println();
	
	for(int i=0;i<arr.length-1;i++){
		for(int j=0;j<arr.length-i-1;j++){
			if(arr[j]>arr[j+1]){// comparsion 
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1]= temp;
			}
		}
		
	}
	
	int longest =1;
	int count=1;
	
		for(int i=1;i<arr.length;i++){
			if(arr[i]==arr[i-1]){
				continue;
			}
			if(arr[i] == arr[i-1]+1){
				count++;
			}else{
				if(count>longest){
					longest=count;
				}
				count=1;
			}
		}
		if(count > longest){
			longest =count;
			
		}
		System.out.println("longest consecutive sequence is: " + longest);
	}
}