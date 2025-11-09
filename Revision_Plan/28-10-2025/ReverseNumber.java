import java.util.*;

public class ReverseNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);


        System.out.print("Eneter the number: ");
        int num = sc.nextInt();

        int rev=0;
        int temp = num;

        while(num!=0){
            int dig = num%10;
            rev = rev* 10 + dig;
            num = num/10;

        }
        System.out.println("Reversed number is: " + rev);
    }


}