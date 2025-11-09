public class AlphabetPa{
    public static void main(String args[]){

        int a = 65;

        for(int i=0;i<4;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)a + " ");
            }
            a++;
            System.out.println();
        }
    }
}