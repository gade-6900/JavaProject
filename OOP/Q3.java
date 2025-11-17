
import java.util.*;

public class Q3 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		try {
			System.out.print("Enter the first Integer: ");
			int num1= sc.nextInt();
			
			System.out.print("Enter the second Integer: ");
			int num2 = sc.nextInt();
			int result= num1/num2;
			
			System.out.println("Result is: "+ result);
		}
		catch(ArithmeticException e){
			System.out.println("Error:  Division by zero is not alloed..");
		}
		catch(NullPointerException e) {
			System.out.println("Error: Please enter valid value..");
		}
		catch(NumberFormatException e) {
			System.out.println("Error: Number formt is not match:  ");
			
		}
        catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Error: Array goes outof bound...");
        }
        
        catch(Exception ex){
            System.err.println(ex.getMessage());
        }
		
	}

	


}
