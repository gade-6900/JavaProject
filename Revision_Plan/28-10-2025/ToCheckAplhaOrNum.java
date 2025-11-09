import java.util.*;
public class ToCheckAplhaOrNum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Charctor: ");
        char ch = sc.next().charAt(0);

        if((ch>='a'&& ch>= 'z' ) || (ch>='A' && ch>= 'Z')){
            System.out.println("This the charctor: " + ch);
        }else{
            System.out.println("this is the special  Sysmbol: "+ ch );
        }

    }
}