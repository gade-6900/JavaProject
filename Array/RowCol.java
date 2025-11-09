public class RowCol{
    public static void main(String args[]){

        int [] [] num = {{1,4,2},{3,6,8,5,2}};

        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                System.out.println("num [" + i + "]"+ "["+j+"] = "+num[i][j]);
            }
        }
    }
}