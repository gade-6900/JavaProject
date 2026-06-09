package June_2026;

import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String org = s;
        String rev = "";

        for(int i=s.length()-1;i>=0;i--){
            rev = rev+s.charAt(i);
        }
        if(org == rev){
            System.out.println("String is palindomre..");
        }
        else{
            System.out.println("not palindrome..");
        }
    }
}
