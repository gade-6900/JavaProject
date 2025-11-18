import java.util.*;
class Cube{
    int no;
    Cube(int no){
        this.no=no;
    }
    int getCube(){
        return no*no*no;
    }

}
public class CubeApp{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt(no);

        Cube c1 = new Cube();
        int result = c1.getCube();
        System.out.println("result: "+ result);
    }
}