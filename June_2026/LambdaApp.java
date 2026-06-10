package June_2026;

interface Add{
    int sum(int a, int b);
}
public class LambdaApp {
    public static void main(String[] args){
        Add add = (a,b) ->a +b;
        System.out.println(add);
    }
    
}
