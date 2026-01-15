import java.util.Scanner;
public class CheckPalindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter String : ");
        String s = sc.next();

                // int start = 0;
                // int end = s.length()-1;

                // boolean isPalindrome = true;
                // while(start<end){
                // if(s.charAt(start) != s.charAt(end)){
                //     isPalindrome =false;
                //     break;
                // }
                // start++;
                // end--;
                // }
                // if(isPalindrome){
                //     System.out.println("The String is palindrome..");
                // }else{
                //     System.out.println("The String is not palindrome..");
                // }
        String rev= "";

        for(int i=s.length()-1;i>=0;i--){
            rev = rev+s.charAt(i);
        }
        if(s.equals(rev)){
            System.out.println("String is palindrome");

        }else{
            System.out.println("String is not palindrome..");
        }

    }
}