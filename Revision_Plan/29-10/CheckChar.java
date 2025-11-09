import java.util.Scanner;

public class CheckChar{
    private char ch;

    void setchar(char c){
        ch =c;
    }
    boolean checkChar(){
        if((ch >= 'a' && ch <='z') || (ch >='A' && ch<= 'Z')){
            System.out.println(ch + " this is the alphabets..");
            return true;
        }else if(ch>='0' && ch<='9'){
            System.out.println(ch+ " this are digits..");
            return false;
        }else{
            System.out.println(ch + " this are the special syambol..");
            return false;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        CheckChar obj = new CheckChar();
        
        System.out.print("Enter the Charactor: ");
        char n = sc.next().charAt(0);

        obj.setchar(n);

        boolean result = obj.checkChar();

        System.out.println("returned Values is : "+ result);
    }
}