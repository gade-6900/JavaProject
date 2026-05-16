package Coding_2026.May_2026;
import java.util.Scanner;
import java.util.ArrayList;
public class NegToLeftPosToRight {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter Size: ");
      int n = sc.nextInt();
      
      ArrayList<Integer> list = new ArrayList<>();
      System.out.print("Enter Element: ");
      for(int i=0;i<n;i++){
        list.add(sc.nextInt());
      }

      ArrayList<Integer> result = new ArrayList<>();

      for(int num : list){
        if(num <0){
            result.add(num);
        }
      }
      for(int num: list){
        if(num==0){
            result.add(num);
        }
      }

      for(int num : list){
        if(num >0){
            result.add(num);
        }
      }
      System.out.print("Modyfied: "+ result);
    }
}
