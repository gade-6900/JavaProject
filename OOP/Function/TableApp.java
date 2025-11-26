import java.util.Scanner;
public class TableApp{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m;
        System.out.print("Enter number: ");
        m=sc.nextInt();
        table(m);
    }
    public static void table(int no){
        for(int i=1;i<=10;i++){
            System.out.printf("%d X %d = %d\n",i,no,i*no);

        }
    }
}