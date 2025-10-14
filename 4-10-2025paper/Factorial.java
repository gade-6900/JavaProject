import java.util.*;
public class Factorial{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Eneter array size: ");
        // int n = 3;

        // int arr[] = new int[n];
        // System.out.println("Enter Array Elements: ");
        // for(int i=0;i<n;i++){
        // arr[i] = sc.nextInt();
        // }
        int n =3;
        int arr[] = {3,4,5};

        System.out.println("All Array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
    
        }
        for(int i=0;i<n;i++){
            int fact=1;
            for(int j=1;j<=arr[i];j++){
                fact = fact*j;

            }
            arr[i]=fact;
     

        }

        System.out.println("Array Factorial: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}