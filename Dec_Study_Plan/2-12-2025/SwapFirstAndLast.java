
import java.util.Scanner;

public class SwapFirstAndLast{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");

        int num = sc.nextInt();

        int org = num ;
        int last = num %10;

        int first = num;
        int count=0;

        while(first>=10){
            first = first /10;
            count++;
        }
        int temp =1;
        for(int i=0;i<count;i++){
            temp = temp*10;
        }
        int middle = org % temp;

        middle = middle /10;

        int swapped = (last*temp)+ (middle*10)+first;

        System.out.println("After swpping: "+ swapped);

    }
}