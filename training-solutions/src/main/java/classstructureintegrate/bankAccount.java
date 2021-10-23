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
        this.balance += amount;
    }
    public void withdraw(int amount) {
        this.balance -= amount;
    }

    public String getInfo() {
        return this.owner + " /" + this.accountNumber + "/: " + this.balance + " Huf";
    }
}
