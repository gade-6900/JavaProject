import java.util.Scanner;

public class RemoveSpace {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String a = sc.next();
        char ch[] = a.toCharArray();

        for(int i=0;i<ch.length;i++){
            if(ch[i]!=' ')
                System.out.print(ch[i]);
        }
    }
}
