package June_2026;

import java.util.Scanner;

public class sumOfDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");

        int num  = sc.nextInt();
        int sum =0;

        while(num !=0){
            int digit = num %10;
            sum = sum + digit;
            num = num /10;
        }
        System.out.println("Sum of all digits: "+ sum);
    }
}
