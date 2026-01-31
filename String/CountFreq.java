import java.util.Scanner;
public class CountFreq {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = sc.next();
        char target = 'a';
        char ch[] = s.toCharArray();
        int count =0;

        for(int i=0;i<ch.length;i++){
            if(ch[i]==target){
                count++;
            }
        }
        System.out.println("the count of char: "+count);
    }
}
