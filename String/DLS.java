import java.util.Scanner;

public class DLS {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = sc.next();
        char ch[] = s.toCharArray();
        int L=0,D=0,S=0;

        for(int i=0;i<ch.length;i++){
            char c  = ch[i];

            if((c>='a' && c<='z') || (c>'A'&& c<='Z')){
                L++;
            }
            else if (c>='0' && c<='9'){
            D++;
            }
            else{
                S++;
            }
        }
        System.out.println("Letters:  "+L);
        System.out.println("Digits: "+D);
        System.out.println("Special: "+ S);

    }
}
