import java.util.*;

public class PronicNUmber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {

            for (int x = 1; x * (x + 1) <= i; x++) {

                if (i == x * (x + 1)) {
                    System.out.println(i + " is a Pronic Number");
                    break;
                }
            }
        }


    }
}
