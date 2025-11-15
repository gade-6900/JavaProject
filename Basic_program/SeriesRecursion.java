public class SeriesRecursion{
    static void printSeries(int term, int diff, int n){
        if(n==0){
            return;
        }

        System.out.print(term + " ");
        printSeries(term+diff, diff+2, n-1);
    }
    

    public static void main(String[] args) {

        int start =7;
        int diff = 3;
        int terms=8;
        System.out.println("Series: ");
        printSeries(start, diff, terms);
        
    }
}