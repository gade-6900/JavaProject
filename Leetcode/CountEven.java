import java.util.Scanner;
public class CountEven{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Low: ");
        int low =sc.nextInt();

        System.out.print("Enter High: ");
        int high = sc.nextInt();

        System.out.println(isCount(low,high));

    }
    public static int isCount(int low, int high){
        int count = (high-low)/2;

        if(low%2==0 || high %2==0){
            count++;
        }
        return count;

    }
}