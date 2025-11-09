class BankAccount {
    private int balance = 1000; // initial balance

    // synchronized deposit method
    synchronized void deposit(int amount) {
        System.out.println(Thread.currentThread().getName() + " depositing " + amount);
        balance += amount;
        System.out.println("Updated Balance after deposit: " + balance);
        notify(); // wake up any waiting thread (like withdraw)
    }

    // synchronized withdraw method
    synchronized void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);

        while (balance < amount) {
            System.out.println("Insufficient balance! Waiting for deposit...");
            try {
                wait(); // wait until deposit happens
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        balance -= amount;
        System.out.println("Withdrawal successful! Remaining Balance: " + balance);
    }
}

class DepositThread extends Thread {
    private BankAccount account;

    DepositThread(BankAccount account) {
        this.account = account;
    }

    public void run() {
        int[] deposits = {500, 1000, 200};
        for (int amount : deposits) {
            account.deposit(amount);
            try {
                Thread.sleep(1000); // simulate delay
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class WithdrawThread extends Thread {
    private BankAccount account;

    WithdrawThread(BankAccount account) {
        this.account = account;
    }

    public void run() {
        int[] withdrawals = {800, 1200, 700};
        for (int amount : withdrawals) {
            account.withdraw(amount);
            try {
                Thread.sleep(1200); // simulate delay
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class BankSimulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread depositThread = new DepositThread(account);
        Thread withdrawThread = new WithdrawThread(account);

        depositThread.setName("Depositor");
        withdrawThread.setName("Withdrawer");

        depositThread.start();
        withdrawThread.start();
    }
}
