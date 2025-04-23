package entities;

public class Account {
    private String name;
    private int number;
    private double balance;

    public Account() {

    }

    public Account(String nome, int number, double balance) {
        this.name = nome;
        this.number = number;
        this.balance = balance;
    }

    public Account(String nome, int number) {
        this.name = nome;
        this.number = number;

    }

    public String getName() {
        return name;
    }

    public void setName(String nome) {
        this.name = nome;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double value){
        this.balance += value;
    }
    public void withdraw(double value){
        this.balance -= value;
    }
    public String toString(){
        return "Account " + number
                + ", Holder: "
                + name
                + ", Balance: $ "
                + balance;
    }
}
