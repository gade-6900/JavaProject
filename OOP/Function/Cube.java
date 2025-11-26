import java.util.Scanner;
public class Cube{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int no = sc.nextInt();
        int result = getCube(no);

        System.out.println("cube is: " + result);
    }
    public static int getCube(int m){
        int cube = m*m*m;
        return cube;
    }cla
}