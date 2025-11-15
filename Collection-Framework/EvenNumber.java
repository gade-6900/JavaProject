import java.util.*;
public class EvenNumber{
    public static void main(String[] args) {
          ArrayList<Integer> num = new ArrayList<>();

         num.add(1);
         num.add(2);
         num.add(3);
         num.add(4);
         num.add(5);
         num.add(6);
         num.add(7);
         num.add(8);
         num.add(9);
         num.add(10);
         

         System.out.println("Even number: ");
         for(int n : num){
            if(n%2==0){
                System.out.println(n);
            }
         }
         System.out.println("Odd number: ");
            for(int n : num){
                if(n%2!=0){
                    System.out.println(n);
                }
            }
        


    }
}