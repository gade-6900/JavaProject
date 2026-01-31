import java.util.Scanner;
public class ExeceptionApp{
    public static void main(String rags[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two Num: ");
        int a = sc.nextInt();
      
        
        int b  = sc.nextInt();
        try{
            int c = a/b;
            System.out.print("result : "+c);
        }catch(ArithmeticException e){
            System.out.print("Denominator can not be zero");

        }
    }
}//nullpointer exception
//array index out of bound exception
//number format exception   
//class not found exception
//io exception
//file not found exception
//sql exception

//illegal argument exception

