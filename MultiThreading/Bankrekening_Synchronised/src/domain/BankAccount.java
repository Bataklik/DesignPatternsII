package domain;

public class BankAccount {

    private String name;
    private double saldo;

    public BankAccount(String name, double saldo) {
        this.name = name;
        this.saldo = saldo;
    }

    public String getName() {
        return name;
    }

    public double getSaldo() {
        return saldo;
    }

    public synchronized void deposite(double amount) {
        this.saldo += amount;
    }

    public synchronized void withdraw(double amount) {
        this.saldo -= amount;
    }

    @Override
    public String toString() {
        return "BankAccount: " + name + ", " + saldo + '\n';
    }
}