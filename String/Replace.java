import java.util.Scanner;
public class Replace{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = sc.next();
        char ch[] = s.toCharArray();

        for(int i=0;i<ch.length;i++){
            if(ch[i]==' ')
                ch[i]='-';
            
        }
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]);
        }

    }
}