package Coding_2026.May_2026;
import java.util.*;
public class MaxabsoluteDiff{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size: ");
    int n = sc.nextInt();
    ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter Element: ");
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        int min= list.get(0);
        int max=list.get(0);

        for(int num : list){
            if(num < min){
                min = num;
            }
            if(num > max){
                max = num;
            }

        }

        int diff = Math.abs(max-min);
        System.out.println("Diff of mac : "+ min + " and " + max);
        System.out.println("diff: "+ diff);
    }
}