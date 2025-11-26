import java.util.*;
public class TestApp{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] a  = {10,20,30,40,50,60};
        show(a);
        System.out.println("Array Values: ");
        for(int i=0;i<a.length;i++){
            System.out.printf("%d\t",a[i]);
        }
    }
    public static void show(int m[]){
        m[2]=m[2]*100;
        m[0]= m[2];
    }
}