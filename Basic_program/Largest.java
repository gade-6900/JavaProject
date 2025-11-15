import java.util.Scanner;
public class Largest{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number: ");

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    int result = (a>b && a>c) ? a: (b>c ? b:c);
    System.out.println(result);

    }
}