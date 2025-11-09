import java.util.Scanner;
public class MissingArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n-1];
        System.out.print("Enter Array: ");
        for(int  i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int expSum = n*(n+1)/2;
        int actSum = 0;

        for(int i=0;i<arr.length;i++){
            actSum = actSum + arr[i];
        }
        System.out.println("Missing Array elemts are: " +   (expSum-actSum));
    }
}