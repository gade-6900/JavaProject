class MatrixMultiplier extends Thread {
    private int[][] A, B, result;
    private int row; // the row this thread will calculate

    // Constructor
    MatrixMultiplier(int[][] A, int[][] B, int[][] result, int row) {
        this.A = A;
        this.B = B;
        this.result = result;
        this.row = row;
    }

    // Thread task — compute one row of result
    public void run() {
        for (int j = 0; j < B[0].length; j++) {
            result[row][j] = 0;
            for (int k = 0; k < A[0].length; k++) {
                result[row][j] += A[row][k] * B[k][j];
            }
        }
        System.out.println("Thread for row " + row + " completed.");
    }
}

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};

        int[][] B = {{9, 8, 7},{6, 5, 4},{3, 2, 1}};

        int[][] result = new int[3][3];

        // Create one thread per row
        MatrixMultiplier[] threads = new MatrixMultiplier[3];
        for (int i = 0; i < 3; i++) {
            threads[i] = new MatrixMultiplier(A, B, result, i);
            threads[i].start();
        }

        // Wait for all threads to finish
        try {
            for (int i = 0; i < 3; i++) {
                threads[i].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Display result matrix
        System.out.println("\nResultant Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
