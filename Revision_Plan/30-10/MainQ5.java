import java.util.Arrays;

// Q5: Overriding
class ArrParent {
    int arr[];

    void setValue(int arr[]) {
        this.arr = arr;
    }

    void arrangeSeq() {
        System.out.println("Original Array: " + Arrays.toString(arr));
    }
}

class ArrangeAscendingOrder extends ArrParent {
    @Override
    void arrangeSeq() {
        Arrays.sort(arr);
        System.out.println("Ascending Order: " + Arrays.toString(arr));
    }
}

class ReverseArray extends ArrParent {
    @Override
    void arrangeSeq() {
        System.out.print("Reversed Array: [");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + (i > 0 ? ", " : ""));
        }
        System.out.println("]");
    }
}

public class MainQ5 {
    public static void main(String[] args) {
        int[] data = {5, 3, 9, 1};

        ArrangeAscendingOrder asc = new ArrangeAscendingOrder();
        asc.setValue(data);
        asc.arrangeSeq();

        ReverseArray rev = new ReverseArray();
        rev.setValue(data);
        rev.arrangeSeq();
    }
}
