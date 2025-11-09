import java.util.Scanner;
public class SecondMaxArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter Array: ");

        for(int i=0;i<arr.length;i++){
            arr[i] =sc.nextInt();
        }

        int first =0;
        int second =0;


        for(int i=0;i<arr.length;i++){
            if(arr[i] > first){
                second = first;
                first = arr[i];
            }
            else if(arr[i] > second && arr[i] != first){
                second = arr[i];
            }
        }
        System.out.println("Second larg array element: "+ second);
    }
}