public class MultiDi{
    public static void main(String args[]){

        int [] [] num = {{1,2,3},{4,5,6}};

        for(int[] row : num){
            for(int a : row){
                System.out.print(a+" ");
            }
        }
    }
}