import java.util.*;
public class MultiplesOfArray{
    public static void main(String x[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Array size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        
        System.out.println("Enter " + n + " array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();

        }

        System.out.println("Orignal array list: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<arr.length;i++){
         if(arr[i]%5==0){
            arr[i]=5;
         }

        }
        System.out.println("Array list: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }



    }
}