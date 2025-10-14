import java.util.*;
public class Discount{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

    System.out.println("Enter rate: ");
    int rate = sc.nextInt();

    System.out.println("Enter Qty: ");
    int Qty = sc.nextInt();

    int bill  = rate*Qty;

    if(bill>5000){
        int dis = ((Qty*rate)*20)/100;
        bill = (Qty*rate)-dis;
    }else{
        bill = Qty*rate;
    }
    System.out.printf("Bill is %d\n" ,bill);
    }
}