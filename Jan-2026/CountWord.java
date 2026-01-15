
import java.util.Scanner;
public class CountWord{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter String : ");
        String s = "gade shubham pandurang";
        int count =1;

        for(int i=0;i<s.length();i++){
           if( s.charAt(i) == ' '){
            count++;
           }
        }
        System.out.println("Count of words in String : " + count);
    }
}