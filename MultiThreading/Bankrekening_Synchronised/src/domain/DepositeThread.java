package domain;

import java.security.SecureRandom;

public class DepositeThread implements Runnable {

    private BankAccount account;

    public DepositeThread(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        try {
            System.out.println("DepositeThread: "+ account);
            Thread.sleep(new SecureRandom().nextInt(1000, 2000));
            System.out.println("Started depositing 100 to saldo of " + account.getName());
            Thread.sleep(new SecureRandom().nextInt(1000, 4000));
            account.deposite(100);
            System.out.println("deposited 100 to saldo of " + account.getName());
            Thread.sleep(new SecureRandom().nextInt(1000, 2000));

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}