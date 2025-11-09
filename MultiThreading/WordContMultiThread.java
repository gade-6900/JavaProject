class WordCounterThread extends Thread {
    private String textPart;
    private SharedTotal total;  // shared object

    // Constructor
    WordCounterThread(String textPart, SharedTotal total) {
        this.textPart = textPart;
        this.total = total;
    }

    public void run() {
        // Split part into words
        String[] words = textPart.trim().split("\\s+");
        int count = words.length;

        // Add this count to total (thread-safe)
        total.addCount(count);
    }
}

// Shared object for total count
class SharedTotal {
    private int totalCount = 0;

    // synchronized method to prevent race condition
    public synchronized void addCount(int count) {
        totalCount += count;
    }

    public int getTotalCount() {
        return totalCount;
    }
}

public class WordContMultiThread {
    public static void main(String[] args) {
        // Large text (simulate big file)
        String text = "Multithreading allows concurrent processing of data. "
                    + "This example splits a text into parts and counts words using multiple threads. "
                    + "Each thread processes a chunk of text independently.";

        // Split text into parts (3 threads)
        String[] parts = text.split("\\. ");

        // Create shared object
        SharedTotal total = new SharedTotal();

        // Create threads
        WordCounterThread[] threads = new WordCounterThread[parts.length];
        for (int i = 0; i < parts.length; i++) {
            threads[i] = new WordCounterThread(parts[i], total);
            threads[i].start();
        }

        // Wait for all threads to finish
        for (int i = 0; i < parts.length; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Print final total
        System.out.println("Total word count: " + total.getTotalCount());
    }
}
