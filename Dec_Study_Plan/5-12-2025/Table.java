import java.util.Scanner;
class Tbl{
    int num;

    void acceptNum(){
        Scanner sc= new Scanner(System.in);   
        System.out.print("Enter number: ");
        num = sc.nextInt();
    }
    void printTable(){
        for(int i=1;i<=10;i++){
            System.out.println(num + " x " + i + " = "+ (num*i));
        }
    }
}
public class Table{
    public static void main(String[] args) {
        Tbl t = new Tbl();
        t.acceptNum();
        t.printTable();

    }

}