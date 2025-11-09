public class EvenOdd {
    private final Object lock = new Object();
    private boolean isOdd = true; // start with odd

    public static void main(String[] args) {
        EvenOdd obj = new EvenOdd();
        Thread oddThread = new Thread(obj.createOddPrinter(20), "OddThread");
        Thread evenThread = new Thread(obj.createEvenPrinter(20), "EvenThread");

        oddThread.start();
        evenThread.start();
    }

    // Runnable for Odd Numbers
    private Runnable createOddPrinter(int max) {
        return () -> {
            for (int i = 1; i <= max; i += 2) {
                synchronized (lock) {
                    while (!isOdd) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + " : " + i);
                    isOdd = false;
                    lock.notify();
                }
            }
        };
    }

    // Runnable for Even Numbers
    private Runnable createEvenPrinter(int max) {
        return () -> {
            for (int i = 2; i <= max; i += 2) {
                synchronized (lock) {
                    while (isOdd) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + " : " + i);
                    isOdd = true;
                    lock.notify();
                }
            }
        };
    }
}
