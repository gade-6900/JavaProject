// Q3: Abstract class Bank + Interface AccountInfo
abstract class Bank {
    abstract double rateOfInterest();
}

interface AccountInfo {
    void displayAccount();
}

class SBI extends Bank implements AccountInfo {
    String accNo, name;

    SBI(String accNo, String name) {
        this.accNo = accNo;
        this.name = name;
    }

    double rateOfInterest() {
        return 6.5;
    }

    public void displayAccount() {
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accNo);
        System.out.println("Rate of Interest: " + rateOfInterest() + "%");
    }
}

public class MainQ3 {
    public static void main(String[] args) {
        AccountInfo a = new SBI("1234567890", "Shubham Gade");
        a.displayAccount();
    }
}
