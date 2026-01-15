import java.util.*;
public class SecondMax{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int max =-1;
        int sMax =-1;
        int[] arr = new int[size];

        System.out.print("Enter elements: ");
        for(int i=0;i<size;i++){
            arr[i] =sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>sMax && arr[i] != max){
                sMax = arr[i];
            }
        }
        System.out.println("Max: "+ max);
        System.out.println("Second max: "+ sMax);
    }
}