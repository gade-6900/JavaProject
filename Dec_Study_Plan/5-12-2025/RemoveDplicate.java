import java.util.*;
public class RemoveDplicate{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.print("ENter size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter elements: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
       int uniqueCount  = removeD(arr);

        System.out.println("After remove duplicate : ");
        for(int i=0;i<uniqueCount ;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static int removeD(int[] arr){
        if(arr.length == 0) return 0;
        int i=0;

        for(int j=1;j<arr.length;j++){
            if(arr[j] !=arr[i]){
                i++;
                arr[i] = arr[j];
            }

        }
        return i+1;

    }

}