import java.util.Scanner;
public class FindMaxandMin{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        

        System.out.print("Enter Array elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Max Array: "+ max);
        System.out.println("Min Array: "+ min);

    }
}