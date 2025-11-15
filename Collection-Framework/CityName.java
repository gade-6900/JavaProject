
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class CityName{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Collection<String> cities = new ArrayList<>() ;

        System.out.println("Enter 5 city names: ");
        for(int i=1;i<=5;i++){
            String list = sc.nextLine();
            cities.add(list);

        }
        System.out.println("--------***************-----------");
        for(String c : cities){
            System.out.print(c+ " ");
        }
    }
}