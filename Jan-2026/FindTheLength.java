import java.util.Scanner;
public class FindTheLength{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = sc.next();
        int count=0;

        for(int i : s.toCharArray()){
            count++;
        }
System.out.println("Count : "+ count);


       
    }
}