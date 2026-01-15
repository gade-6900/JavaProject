
import java.util.Scanner;

public class RemoveDuplicate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();

        int[] arr =  new int[size];
        System.out.print("Enter array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int newSize = size;
        for(int i=0;i<newSize;i++){
            for(int j=i+1;j<newSize;j++){
                if(arr[i]==arr[j]){
                    for(int k =j;k<newSize-1;k++){
                        arr[k] = arr[k+1];
                    }
                    newSize--;
                    j--;
                }
            }

        }
        System.out.println("After Remove duplicate ..");
        for(int i=0;i<newSize;i++){
            System.out.print(arr[i]+" ");
        }

    }
}