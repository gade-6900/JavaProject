import java.util.*;
public class ReplaceDivisibleBy3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = 5;
        int[] arr = new int[n];
        System.out.println("Enter array elemt: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println();
        for(int i=0;i<arr.length;i++){
            if(arr[i] %3 ==0 ){
                arr[i] =-1;
            }
        }
        System.out.println("After divied by 3: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
