class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAcc {
    int bal;

    public BankAcc(int bal) {
        this.bal = bal;
    }

    void deposit(int amt) {
        bal += amt;
        System.out.println("Balance: " + bal);
    }

    void withdraw(int amt) throws InsufficientBalanceException {
        if (amt <= bal) {
            bal -= amt;
            System.out.println("Withdraw successful");
        } else {
            throw new InsufficientBalanceException("Insufficient balance");
        }
    }

    void balCheck() {
        System.out.println("Available balance: " + bal);
    }
}

public class Encap {
    public static void main(String[] args) {
        BankAcc ac = new BankAcc(1000);

        ac.deposit(500);
        ac.balCheck();

        try {
            ac.withdraw(1000);
            ac.balCheck();

            ac.withdraw(1000); // this will throw exception
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
