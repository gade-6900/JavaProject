
import java.util.Scanner;

public class ProductOfDigit{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int product = 1;
        int temp =num;

        while(temp>0){
            int digit = temp %10;
            product = product*digit;
            temp = temp/10;
        }

        System.out.println("Product of digit : "+ product);
    }
}