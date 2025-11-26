import java.util.*;
public class SortArray{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int[] a = new int[5];
        System.out.print("Enter Array : ");
        for(int i=0;i<a.length;i++){
            a[i] =sc.nextInt();
        }
        int result[] = getSortedArray(a);
        for(int i=0; i<result.length; i++){
            
            System.out.printf("%d\t",result[i]);

        }

    }
    public static int[]  getSortedArray(int[] m){
        for(int i=0;i<m.length;i++){
            for(int j=1+i;j<m.length;j++){
                if(m[i]>m[j]){
                int temp = m[i];
                m[i] =m[j];
                m[j] = temp;
                }
            }
        }
        return m;
    }
}