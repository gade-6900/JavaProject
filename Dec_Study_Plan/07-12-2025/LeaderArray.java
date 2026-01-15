import java.util.Scanner;
public class LeaderArray{
    public static void FindLeader(int[] arr){
        int n = arr.length;
        int maxFromRight = arr[n-1];
        System.out.print(maxFromRight+ " ");

        for(int i=n-2;i>=0;i--){
            if(arr[i]>maxFromRight){
                maxFromRight = arr[i];
                System.out.print(maxFromRight+" ");
            }
        }

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size =sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        FindLeader(arr);

    }
}