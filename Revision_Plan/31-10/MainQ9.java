// Q9: Interface ArrayTasks
interface ArrayTasks {
    int countEven(int arr[]);
    int countOdd(int arr[]);
}

class EvenOddCounter implements ArrayTasks {
    public int countEven(int arr[]) {
        int c = 0;
        for (int n : arr)
            if (n % 2 == 0)
                c++;
        return c;
    }

    public int countOdd(int arr[]) {
        int c = 0;
        for (int n : arr)
            if (n % 2 != 0)
                c++;
        return c;
    }
}

public class MainQ9 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};

        EvenOddCounter e = new EvenOddCounter();
        System.out.println("Even Count: " + e.countEven(arr));
        System.out.println("Odd Count: " + e.countOdd(arr));
    }
}
