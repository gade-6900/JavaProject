public class AlphabetPattern{
    public static void main(String args[]){

        for(int i =0;i<7;i++){
            for(int j=65;j<64+(2*7);j++){
                if(i>=(64+7)+i)
                    System.out.print((char)((64+7)-(j%(64+7))));
                else if(j <= (64+7)-i)
                    System.out.print((char)j);
                else
                    System.out.print(" ");
                
            }
            System.out.println();
        }
    }
    
}