public class NumberIncrement{
    public static void main(String args[]){

        // for(int i=1;i<=7;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
        // for(int i=6;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
        int n = 7;

        for (int i = 1; i <= 2 * n - 1; i++) {

            int limit = (i <= n) ? i : 2 * n - i;

            for (int j = 1; j <= limit; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}