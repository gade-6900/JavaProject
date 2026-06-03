package June_2026;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int count =0;
        while (num !=0) {
            count++;
            num = num /10;
        }
System.out.println(count);
    }
}
