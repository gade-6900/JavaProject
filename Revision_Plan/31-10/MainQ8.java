// Q8: Abstract class Statistics
abstract class Statistics {
    abstract double compute(int arr[]);
}

class Average extends Statistics {
    double compute(int arr[]) {
        double sum = 0;
        for (int num : arr) sum += num;
        return sum / arr.length;
    }
}

class Variance extends Statistics {
    double compute(int arr[]) {
        double mean = new Average().compute(arr);
        double sumSq = 0;
        for (int num : arr)
            sumSq += Math.pow(num - mean, 2);
        return sumSq / arr.length;
    }
}

public class MainQ8 {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};

        Statistics s;

        s = new Average();
        System.out.println("Average: " + s.compute(arr));

        s = new Variance();
        System.out.println("Variance: " + s.compute(arr));
    }
}
