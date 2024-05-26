package domain;

import java.security.SecureRandom;

public class WithDrawThread implements Runnable {

    private BankAccount account;

    public WithDrawThread(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        try {
            System.out.println("WithDrawThread: "+ account);
            Thread.sleep(new SecureRandom().nextInt(1000, 2000));
            System.out.println("Started withdrawing 100 to saldo of " + account.getName());
            Thread.sleep(new SecureRandom().nextInt(1000, 4000));
            account.withdraw(100);
            System.out.println("withdrew 100 to saldo of " + account.getName());
            Thread.sleep(new SecureRandom().nextInt(1000, 2000));
            System.out.println(account);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}