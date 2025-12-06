import java.util.*;
public class SumOfFirstAndLast{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int last = num%10;

        int first = num;

        while(first>=10){
            first = first /10;
        }
        int sum = last + first;

        System.out.println(sum);

    }
}