import java.util.Arrays;

// Q7: Abstract ArrayProcess
abstract class ArrayProcess {
    abstract void process(int arr[]);
}

class ArrayReverse extends ArrayProcess {
    void process(int arr[]) {
        System.out.print("Reversed Array: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

class ArraySort extends ArrayProcess {
    void process(int arr[]) {
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}

public class MainQ7 {
    public static void main(String[] args) {
        int arr[] = {5, 2, 9, 1, 3};

        ArrayProcess rev = new ArrayReverse();
        rev.process(arr);

        ArrayProcess sort = new ArraySort();
        sort.process(arr);
    }
}
