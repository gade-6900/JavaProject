import java.util.Scanner;
public class ReverseString{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the String: ");
    String string = sc.nextLine();
    String reverse ="";

    for(int i= string.length()-1;i>=0;i--){
        reverse = reverse+string.charAt(i);
    }
    System.out.println("reversed String is: "+ reverse);

    }
}