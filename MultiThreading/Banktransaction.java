// BankTransaction.java
class BankAccount {
    private int balance;

    // Constructor
    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    // Synchronized deposit method
    public synchronized void deposit(int amount) {
        System.out.println(Thread.currentThread().getName() + " is depositing " + amount);
        int newBalance = balance + amount;

        try {
            Thread.sleep(1000); // simulate delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        balance = newBalance;
        System.out.println(Thread.currentThread().getName() + " completed deposit. New balance: " + balance);
        notify(); // wake up waiting thread if any
    }

    // Synchronized withdraw method
    public synchronized void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " is trying to withdraw " + amount);

        // Wait if balance is insufficient
        while (balance < amount) {
            System.out.println("Insufficient balance! " + Thread.currentThread().getName() + " is waiting...");
            try {
                wait(); // wait until deposit is made
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        int newBalance = balance - amount;

        try {
            Thread.sleep(1000); // simulate delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        balance = newBalance;
        System.out.println(Thread.currentThread().getName() + " completed withdrawal. New balance: " + balance);
    }

    public int getBalance() {
        return balance;
    }
}

// Main class
public class Banktransaction {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000); // starting balance

        // Thread 1: Depositor
        Thread depositor = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                account.deposit(2000);
            }
        }, "Depositor");

        // Thread 2: Withdrawer
        Thread withdrawer = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                account.withdraw(3000);
            }
        }, "Withdrawer");

        // Start both threads
        depositor.start();
        withdrawer.start();
    }
}
