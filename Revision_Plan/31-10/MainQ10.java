// Q10: Abstract ArrayOperation
abstract class ArrayOperation {
    abstract int calculate(int arr[]);
}

class ArraySum extends ArrayOperation {
    int calculate(int arr[]) {
        int sum = 0;
        for (int n : arr)
            sum = sum + n;
        return sum;
    }
}

class ArrayProduct extends ArrayOperation {
    int calculate(int arr[]) {
        int prod = 1;
        for (int n : arr)
            prod = prod * n;
        return prod;
    }
}

public class MainQ10 {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5};

        ArrayOperation op;

        op = new ArraySum();
        System.out.println("Sum: " + op.calculate(arr));

        op = new ArrayProduct();
        System.out.println("Product: " + op.calculate(arr));
    }
}
