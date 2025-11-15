
import java.util.Scanner;

public class LastTwoSwap{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Input: ");
        int num = sc.nextInt();

        int temp=num;
        int digit=0;

        while(temp >0){
            digit++;
            temp= temp /10;
        }
        int power =1;
        for(int i=1;i<=digit-2;i++){
            power = power*10;
        }
        int firstTwo = num/power;
        int lastTwo = num%100;

        int remaining = num % power;
        int middle = remaining /100;


        int midpower=1;
        for(int i=1;i<=digit-4;i++){
            midpower = midpower *10;
        }
        int swappped =  lastTwo* midpower *100+ middle*100+ firstTwo;

        System.err.println("output: "+ swappped);

    }
}
/*import java.util.Scanner;

public class SwapDigitsManual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int num = sc.nextInt();

        int temp = num;
        int digits = 0;

        // Count number of digits
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        // Ensure number has at least 4 digits
        if (digits < 4) {
            System.out.println("Number must have at least 4 digits.");
            return;
        }

        int power = (int)Math.pow(10, digits - 2);
        int firstTwo = num / power;          // first two digits
        int lastTwo = num % 100;             // last two digits

        // Remove first two digits
        int remaining = num % power;

        // Remove last two digits from the remaining
        int middle = remaining / 100;

        // Rebuild number: lastTwo + middle + firstTwo
        int swapped = lastTwo * (int)Math.pow(10, digits - 4) + middle * 100 + firstTwo;

        System.out.println("Output: " + swapped);
    }
}
*/

