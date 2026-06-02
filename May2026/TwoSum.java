package May2026;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i=0;i<n;i++){
            num[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i] + num[j] == target){
                    System.out.println("[ "+i+ " "+ j + " ]");
                }
            }
        }
    }
}
