import java.util.Scanner;
public class MinArr {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter Arrry elemets:" );
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int min=arr[0];;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Min array  elemets is :"+ min);

    }
    
}
