import java.util.Scanner;
public class PalindromNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int org =num;
        int rev =0;
    
    
        while(num != 0){
            int digit = num%10;
            rev = rev * 10 + digit;
            num = num /10;
        }
        if(org == rev ){
            System.out.println("num is palindrome: " + num);
        }
        else{
            System.out.println("number is not palindrome: ");
        }


    }
}