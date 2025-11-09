
import java.util.Scanner;

public class ArraySortedOrNot{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("size: ");
        int n = sc.nextInt();// enter size..

        int[] arr = new int[n];// give array..............................
        System.out.print("Enter Array : ");
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }

        boolean sorted = true;
        // to check sorted or not 
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]> arr[i+1]){
                sorted = false;
                break;
            }
        }
        // to check the this condition for 
        if(sorted){
            System.out.println("Array is sorted.. " );
        }
        else{
            System.out.println("Array is not sorted.. ");
        }

    }
}
