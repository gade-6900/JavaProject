class BankAccount{
    int balanace =0;


    void deposite(int Amount){
        balanace = balanace+ Amount;
    }
    int getBalance(){
        return balanace;
    }
}
class depositeThread extends Thread{
    BankAccount account;

    public depositeThread(BankAccount account) {
        this.account=account;
    }

    public void run(){
        for(int i=0;i<100;i++){
            account.deposite(1000);

        }
    }
}

public class RaceCondition{
    public static void main(String args[]){

        BankAccount account = new BankAccount();

        depositeThread d1 = new depositeThread(account);
        depositeThread d2 = new depositeThread(account);

        d1.start();
        d2.start();

        try {
            d1.join();
            d2.join();

            
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("final balance: "+ account.getBalance());

    }
}