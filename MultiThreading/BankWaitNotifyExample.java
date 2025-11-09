class Account {
    private int balance = 10000; // shared resource

    // Withdraw method (synchronized)
    synchronized void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " wants to withdraw : " + amount);

        // Check for sufficient balance
        while (balance < amount) {
            System.out.println("Insufficient balance for " + Thread.currentThread().getName() + 
                               ". Waiting for deposit...");
            try {
                wait(); // wait until notified (when deposit happens)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Withdraw after balance is sufficient
        balance -= amount;
        System.out.println(Thread.currentThread().getName() + 
                           " completed withdrawal. Remaining balance : " + balance);
    }

    // Deposit method (synchronized)
    synchronized void deposit(int amount) {
        System.out.println(Thread.currentThread().getName() + " is depositing : " + amount);
        balance += amount;
        System.out.println(Thread.currentThread().getName() + 
                           " completed deposit. New balance : " + balance);

        notify(); // notify waiting thread (withdrawer)
    }

    int getBalance() {
        return balance;
    }
}

class WithdrawThread extends Thread {
    Account account;
    WithdrawThread(Account account) {
        this.account = account;
    }
    public void run() {
        account.withdraw(7000);
    }
}

class DepositThread extends Thread {
    Account account;
    DepositThread(Account account) {
        this.account = account;
    }
    public void run() {
        account.deposit(5000);
    }
}

public class BankWaitNotifyExample {
    public static void main(String[] args) {
        Account account = new Account();

        WithdrawThread t1 = new WithdrawThread(account);
        DepositThread t2 = new DepositThread(account);

        t1.setName("WithdrawThread");
        t2.setName("DepositThread");

        t1.start();
        t2.start();
    }
}
