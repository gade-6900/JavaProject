import java.util.*;
public class FindMin{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("size: ");
        int n = sc.nextInt();
      
        
        int[] arr = new int[n];
        System.out.print("Enter Array elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();

        }
      int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] < min){
                min =  arr[i];
            }
        }
        System.out.println("Min array element is: "+ min);
    }
}