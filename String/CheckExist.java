import java.util.*;
public class CheckExist{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.next();

        System.out.print("Enter target: ");
        char target = sc.next().charAt(0);
        char ch [] = str.toCharArray();
        boolean found = false;

        for(int i=0;i<ch.length;i++){
            if(ch[i]==target){
                found = true;
                break;

            }
        }
        if(found){
            System.out.println("Found....");
        }
        else{
            System.out.println("not found");
        }
    }
}