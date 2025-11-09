
import java.util.Scanner;

public class ArrayRearrangement{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int[] arr = {2,3,-4,-1,6,-9};
         int n = arr.length;

        int[] pos = new int[n];
        int[] neg = new int[n];

        int p=0,q=0;
        for(int i=0;i<n;i++){
            if(arr[i] >= 0){
                pos[p++] = arr[i];

            }else{
                neg[q++] = arr[i];
            }
        }
            int i=0;
            int  j=0;
            int  k=0;
            while(i<p && j<q){
                arr[k++] = pos[i++];
                arr[k++] = neg[j++];
            }
            while(i<p){
                arr[k++] = pos[i++];

            }
            while(j<p){
                arr[k++] = neg[j++];
            }

            System.out.print("Rearranged Array : ");
            for(int s=0;s<n;s++){
                System.out.print(arr[s]+" ");
            }
        

    }
}