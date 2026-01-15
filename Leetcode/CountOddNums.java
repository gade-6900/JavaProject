import java.util.Scanner;
public class CountOddNums{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Eneter Low: ");
        int low= sc.nextInt();

        System.out.print("Enter high: ");
        int high = sc.nextInt();

        System.out.print("The Odd count is : "+CountOdd(low,high));
    }
    public static int CountOdd(int low, int high){
        int count = (high- low)/2;
        if(low %2 !=0 || high%2!=0){
            count++;
        }
        return count;   
    }
}