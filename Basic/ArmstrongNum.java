
import java.util.Scanner;

public class ArmstrongNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int orgNum = num;
        int sum=0;
        int digits = String.valueOf(num).length();
        while(num !=0){
            int digit = num % 10;
            sum += Math.pow(digit,digits);
            num = num/10;
        }
        if(sum == orgNum){
            System.out.println(orgNum + " Armstong number");
        }
        else{
            System.out.println(orgNum + " not Armstrong Number.");
        }
    }
}