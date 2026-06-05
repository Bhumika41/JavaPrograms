package encapsulation;

class Bank {
    private double balance;
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
}
public class bank {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.setBalance(5000);
        System.out.println("Bank Balance: " + b.getBalance());
    }
}