import java.util.*;
import java.util.Arrays;
public class ValidAnagram{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First String: ");
        String a = sc.nextLine();

        System.out.print("Enter Second String: ");
        String b = sc.nextLine();

        if(isAnagram(a,b)){
            System.out.println("Both anagram: ");
        }else{
            System.out.println("String are no t same: ");
        }

    }
    public static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }

        char[] ar =  s1.toCharArray();
        char[] ar2 = s2.toCharArray();

        Arrays.sort(ar);
        Arrays.sort(ar2);

        return Arrays.equals(ar,ar2);
    }
}