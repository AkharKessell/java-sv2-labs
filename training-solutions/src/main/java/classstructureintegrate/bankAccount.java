package src.main.java.classstructureintegrate;

public class bankAccount {
    private String accountNumber;
    private String owner;
    private int balance;

    public bankAccount(String account, String owner, int balance) {
        this.accountNumber = account;
        this.owner = owner;
        this.balance = balance;
    }
    public void deposit(int amount) {
        balance += amount;
    }
    public void withdraw(int amount) {
        balance -= amount;
    }
    public String getInfo() {
        return owner + " /" + accountNumber + "/: " + balance + " Ft";
    }
}
