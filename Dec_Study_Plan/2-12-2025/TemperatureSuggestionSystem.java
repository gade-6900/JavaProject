import java.util.*;
public class TemperatureSuggestionSystem{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Tempeture: ");
        int temp = sc.nextInt();

        if(temp >= 40){
            System.out.println("Too Hot..");
        }
        else if(temp >= 30  && temp <= 39){
            System.out.println("Summer days..");
    
        }
        else if( temp >= 20 && temp <=29){
            System.out.println("Pleasant..");

        }
        else if(temp >= 10 && temp <= 19){
            System.out.println("Cool");


        }
        else{
           System.out.println("Very cool..."); 
        }
    }
}