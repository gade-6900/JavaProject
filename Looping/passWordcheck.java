import java.util.*;
public class passWordcheck{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String password;
        String correctPass = "Gade@6900";
        System.out.print("Enter Password: ");
        password= sc.nextLine();
        do { 

        if(!password.equals(correctPass)){
            System.out.println("invalid password! try Again....");
        }      
        } while (!password.equals(password));
        System.out.println("Correct Password...");
    }
}