package June_2026;
import java.util.*;
public class PalindromeCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int org = num;
        int rev=0;
        while(num !=0){
            int digit = num %10;
            rev = rev * 10+digit;
            num =num /10;
        }
        if(org == rev){
            System.out.println("Palindrome....");
        }else{
            System.out.println("Not Palindrome....");
        }
    }
}
