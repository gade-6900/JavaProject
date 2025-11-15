import java.util.*;
public class MultiOfElement{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter Array: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]%5==0){
                arr[i]=5;
            }
        }
        System.out.println("final: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            
        }

    }

}