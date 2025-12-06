import java.util.*;
public class ATMWithdrawalValidation{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Balance: ");
        int balance = sc.nextInt();

        System.out.print("Enter Withdraw: ");
        int withdraw = sc.nextInt();

        if(withdraw <= balance && withdraw % 5 == 0){
            System.out.println("Success");
        }
        else if(withdraw % 5 != 0){
            System.out.println("Invalid Amount");
        }
        else{
            System.out.println("Insufficient Funds");
        }
    }
}
