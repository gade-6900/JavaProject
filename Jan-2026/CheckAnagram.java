import java.util.Scanner;
public class CheckAnagram{
    public static void main(String aargs[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 String : ");
        String s1 = sc.next();
        System.out.print("Enter 2 String : ");
        String s2 = sc.next();

        if (s1.length() != s2.length()){
            System.out.println("Not Anagram ");
            return;
        }

        int[] freq = new int[256];

        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)]++;
            freq[s2.charAt(i)]--;

        }
        boolean isAnagram = true;
        for(int i=0;i<256;i++){
            if(freq[i]  !=0){
                isAnagram = false;
                break;
            }
        }

        if(isAnagram){
            System.out.println("Anagram .");
        }else{
            System.out.println("Is Not Anagram .");
        }

    }
}