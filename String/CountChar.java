import java.util.Scanner;
public class CountChar{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.next();

        for(int i=0 ;i<s.length();i++){
            char  ch = s.charAt(i);
            int count =0;



            boolean isalreadyCheck = false;
            for(int k=0;k<i;k++){
                if(s.charAt(k)==ch){
                    isalreadyCheck = true;
                    break;
                }
            }
            for(int j=0;j<s.length();j++){
                if(s.charAt(j) ==ch ){
                    count++;
                }
            }
            if(count>1){
                System.out.println(ch);
            }
        }
    }
}