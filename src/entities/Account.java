package entities;

public class Account {
    private String holder;
    private int number;
    private double balance;

    public Account() {

    }

    public Account(String holder, int number, double initialDeposit) {
        this.holder = holder;
        this.number = number;
        deposit(initialDeposit);
    }

    public Account(String holder, int number) {
        this.holder = holder;
        this.number = number;

    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String nome) {
        this.holder = holder;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double ammount){
        this.balance += ammount;
    }
    public void withdraw(double ammount){
        this.balance -= ammount + 5.0;
    }
    public String toString(){
        return "Account " + number
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }
}
