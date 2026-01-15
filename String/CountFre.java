import java.util.Scanner;
public class CountFre{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.next();

        int[] freq = new int[256];
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            freq[ch]++;
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(freq[ch]!=0){
                System.out.println(ch + " = "+ freq[ch]);
                freq[ch] =0;
            }
        }

    }
}