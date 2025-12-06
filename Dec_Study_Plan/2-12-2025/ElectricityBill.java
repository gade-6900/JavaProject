import java.util.*;
public class ElectricityBill{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int unit = sc.nextInt();
        // int unit = 350;
        int price=0;

        if(unit <=100){
            price = unit * 3;
        }
        else if(unit <=300){
            price = (100*3) + (unit-100)*5;
        }
        else{
            price = (100*3) + (200*5)+ (unit -300)*7;
        }
        System.out.println(price);
    }
}