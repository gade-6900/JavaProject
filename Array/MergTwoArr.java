import java.util.*;
public class MergTwoArr{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int[] arr1 ={1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};

        int[] arr3 = new int[arr1.length+ arr2.length];

        for(int i=0;i<arr1.length;i++){
            arr3[i] = arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            arr3[i+arr1.length]=arr2[i];
        }
        System.out.println("Merged Array is : " );
        for(int j=0; j < arr3.length; j++){
            System.out.print(arr3[j]+" ");        }



    }
}