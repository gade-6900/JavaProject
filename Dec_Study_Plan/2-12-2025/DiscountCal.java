import java.util.*;
public class DiscountCal{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amount: ");
        int amount = sc.nextInt();
        double discount = 0;

        if(amount >= 5000){
            discount = amount * 0.20;
        }
        else if(amount >= 2000){
            discount = amount * 0.10;

        }

        double finalPrice = amount - discount;

        System.out.println(finalPrice);

    }
}