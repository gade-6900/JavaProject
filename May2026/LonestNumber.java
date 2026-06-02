package May2026;
import java.io.*;
import java.util.*;

public class LonestNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String num = sc.next();
        int k = sc.nextInt();

        Stack<Character> stack = new Stack<>();
        for(char d : num.toCharArray()){
            while(!stack.isEmpty() && k > 0 && stack.peek() < d){
                stack.pop();
                k--;
            }
            stack.push(d);
        }
        while(k>0){
            stack.pop();
            k--;
        }

        StringBuilder ans= new StringBuilder();
        for(char ch : stack){
            ans.append(ch);
        }
        System.out.println(ans.toString());
    }
}