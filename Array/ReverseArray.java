/*Q2. Write a java program to display the reverse array.*/

import java.util.Scanner;
 public class ReverseArray{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n=5;
        int[] arr = new int[n];

        System.out.println("Enter Array Elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("\nArray elements Are: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.print("\nReversed Array: ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }

        
    }
 }