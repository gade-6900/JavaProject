import java.util.Scanner;
 class HighestAltitude{
    public static int largetstAltitude(int[] gain){
        int current =0;
        int Max = 0;

        for(int g:gain){
            current=current+g;
            Max =Math.max(Max,current);
        }
        return Max;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();

        int[] gain = new int[size];
        
        System.out.print("Enter Elements:  ");
        for(int i=0;i<size;i++){
            gain[i] = sc.nextInt();
        }

        System.out.println("Highest Altitude: "+ largetstAltitude(gain));
    }
}
//class SuareOfSortedArray{
//     public int largetstAltitude(int[] gain){
//         int curalt =0;
//         int maxAlt=0;

//         for(int x: gain){
//             curalt = curalt+x;
//             maxAlt = Math.max(maxAlt,curalt);
//         }
//         return maxAlt;
//     }
// }