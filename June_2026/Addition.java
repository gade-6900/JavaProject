package June_2026;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.*;
import java.io.*;


class Add{
    public void add(int... number){
        int sum =0;

        for(int i=0;i<number.length;i++){
            sum +=number[i];
            System.out.print(number[i]);


            if( i != number.length-1){
                System.out.print("+");
            }
        }

        System.out.println("="  + sum);
    }
}
public class Addition {
    public static void main(String[] args) {
        

        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int n1 = Integer.parseInt(br.readLine());
            int n2 = Integer.parseInt(br.readLine());
            int n3 = Integer.parseInt(br.readLine());
            int n4 = Integer.parseInt(br.readLine());
            int n5 = Integer.parseInt(br.readLine());
            int n6 = Integer.parseInt(br.readLine());

            Add ob = new Add();

            ob.add(n1,n2);
            ob.add(n1,n2,n3);
            ob.add(n1,n2,n3,n4,n5);
            ob.add(n1,n2,n3,n4,n5,n6);

            Method[] methods= Add.class.getDeclaredMethods();

            Set<String> set = new HashSet<>();
            boolean overload = false;

            for(int i =0;i<methods.length;i++){

                if(set.contains(methods[i].getName())){
                    overload = false;
                    break;
                }
                set.add(methods[i].getName());
            }


        }catch(Exception  ex){
        ex.printStackTrace();
        }
    }
}
