/*Q1. Write a java program to search an element in an array , its element found or not.
*/

import java.util.Scanner;
public class SearchArrayElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter Array Element: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Eneter Search element: ");
        int searchelement= sc.nextInt();

        boolean found = false;
        System.out.println();
        for(int i=0;i<arr.length;i++){
            if(arr[i] == searchelement){
                found = true;
                System.out.print("\nArray elemets found int the list: "+ (i+1));
            }
        }
        if(!found){
            System.out.println("Array element is not found in the list: "+ searchelement);
        }


    }
}