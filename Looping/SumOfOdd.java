import java.util.*;
public class SumOfOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int sum =0;
        int i=1;

        while(i<=n){
            sum = sum + i;
            i = i + 2;
        }
        System.out.println("Sum of all Odd numbers: " + sum );
    }
}