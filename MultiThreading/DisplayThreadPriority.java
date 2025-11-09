class PriorityDemo extends Thread {
    public void run() {
        System.out.println(getName() + " running with priority " + getPriority());
    }
}

public class DisplayThreadPriority {
    public static void main(String[] args) {
        PriorityDemo p1 = new PriorityDemo();
        PriorityDemo p2 = new PriorityDemo();
        PriorityDemo p3 = new PriorityDemo();

        p1.setName("Low");
        p2.setName("Mid");
        p3.setName("High");

        // ✅ Setting priorities
        p1.setPriority(Thread.MIN_PRIORITY);  // 1
        p2.setPriority(Thread.NORM_PRIORITY); // 5
        p3.setPriority(Thread.MAX_PRIORITY);  // 10

        // ✅ Starting threads
        p1.start();
        p2.start();
        p3.start();
    }
}
                                                                              