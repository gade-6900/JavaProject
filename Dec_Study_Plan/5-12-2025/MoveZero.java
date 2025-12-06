import java.util.*;

public class MoveZero{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter array element: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        moveZero(arr);

        System.out.println("Output: ");
        for(int num:arr){
            System.out.print(num+ " ");
        }
    }
     public static void moveZero(int[] arr){
    int j=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]!=0){

            if(i!=j){   
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j]=temp;
            j++;
            }
        }
    }

}
}