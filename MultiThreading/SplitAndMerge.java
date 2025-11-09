class ASP{
    public void sortArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]= arr[j];
                    arr[j] =temp; 
                }
              
            }
        }
    }
}
class FA extends Thread{
    ASP a;
    int[] first;
    void setResouce(ASP a, int[] first){
        this.a=a;
        this.first=first;
    }
    public void run(){
        System.out.println("first thread sorting first half....");
        a.sortArray(first);
    }

}
class SA extends Thread{
    ASP a;
    int[] second;
    void setResouce(ASP a, int[] second){
        this.a=a;
        this.second=second;
    }
    public void run(){
        System.out.println("second thread sorting second half....");
        a.sortArray(second);
    }
}


public class SplitAndMerge{
    public static void main(String[] args) throws Exception{

        ASP asp  = new ASP();
        int[] arr = new int[]{6,2,3,4,1,5};

        int mid = arr.length/2;
        int[] firstArr = new int[mid];
        int[] secondArr = new int[arr.length-mid];

        for(int i=0;i<mid;i++){
            firstArr[i] = arr[i];
        }
        

        for(int i= mid,j=0;i<arr.length;i++,j++){
            secondArr[j] = arr[i];
        }

        FA firtthread = new FA();
        SA secondthread = new SA();

        firtthread.setName("first");
        secondthread.setName("second");

        firtthread.setResouce(asp, firstArr);
        secondthread.setResouce(asp, secondArr);

        firtthread.start();
        secondthread.start();

        firtthread.join();
        secondthread.join();

        System.out.println("\nAfter sorting first half: ");
        printArray(firstArr);

        System.out.println("\nAfter sorting second half: ");
        printArray(secondArr);


        int[] finalArray =  mergeArrays(firstArr,secondArr);
        System.out.println("\nAfter merging into final: ");
        printArray(finalArray);



         
    }

    public static int[] mergeArrays(int[] first,int[] second){
        int[] merge = new int[first.length + second.length];
        
        int i=0,k=0,j=0;

        while(i < first.length && j <     second.length){
            if(first[i]<second[j]){
                merge[k++] = first[i++];
            }else{
                merge[k++] = second[j++];
            }
        }

        while(i<first.length)merge[k++] = first[i++];
        while(j<second.length)merge[k++] = second[j++];

        return merge;
    }


    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}