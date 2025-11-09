import java.util.*;
public class UpperCase{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");
        String srt = sc.nextLine();
        String result ="";

        for(int i=0;i<srt.length();i++){
         
            char ch = srt.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                ch = (char)(ch-32);
            }
            result = result + ch;
        }
        System.out.println("UpperCase String:  "+ result);

    }
}