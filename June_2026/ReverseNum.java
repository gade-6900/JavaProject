package June_2026;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter number: ");
        int num =sc.nextInt();

        int rev =0;

        while(num !=0){
            int digit = num %10;
            rev = rev * 10+digit;
            num = num /10;

        }
        System.out.println("rreversed number : "+ rev);
    }
}
