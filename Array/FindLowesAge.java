public class FindLowesAge{
    public static void main(String args[]){

        int[] age = {20,18,22,25,52};

        int lowestage= age[0];
        for(int i=0;i<age.length;i++){
            if(age[i]<lowestage){
                lowestage=age[i];
            }
        }
       System.err.println(lowestage);
    }
}