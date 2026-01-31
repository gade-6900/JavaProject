import java.util.Scanner;

public class PalindromeStr {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = sc.next();
        String rev ="";

        char ch[] = s.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            rev = rev + ch[i];
        }
        if(s.equals(rev)){
            System.out.println("String is palindrome: ");
        }
        else{
            System.out.println("String is not palindrome.");        }
    }
}
