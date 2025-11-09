// Q3: ArrSum, GetSum
class ArrSum {
    int arr[];

    void setValue(int arr[]) {
        this.arr = arr;
    }
}

class GetSum extends ArrSum {
    int getArrSum() {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}

public class MainQ3 {
    public static void main(String[] args) {
        GetSum g = new GetSum();
        int arr[] = {10, 20, 30, 40};
        g.setValue(arr);
        System.out.println("Array Sum: " + g.getArrSum());
    }
}
