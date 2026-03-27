class BankAcc{
    int bal = 0;
    public BankAcc(int bal){
        this.bal = bal;
    }
    void deposit(int amt){
        bal += amt;
        System.out.println("balance : " + bal);
    }
    void withdraw(int amt){
        if(amt <= bal){
            System.out.println("Wthdraw successfull");
            bal -= amt;
        }else{
            System.out.println("Insufficient balance");
        }
    }
    void balCheck(){
        System.out.println("Available balance" + bal);
    } 
}
public class Encap {
    public static void main(String[] args) {
        BankAcc ac = new BankAcc(1000);
        ac.deposit(500);
        ac.balCheck();
        ac.withdraw(1000);
        ac.balCheck();
        ac.withdraw(1000);
    }
    
}
