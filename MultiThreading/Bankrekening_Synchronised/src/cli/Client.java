package cli;

import domain.BankAccount;
import domain.DepositeThread;
import domain.WithDrawThread;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            String accountName = "Account " + i;
            int initialBalance = 5000;
            BankAccount account = new BankAccount(accountName, initialBalance);
            accounts.add(account);
        }

        for (BankAccount account : accounts) {
            Thread depositThread = new Thread(new DepositeThread(account));
            Thread withdrawThread = new Thread(new WithDrawThread(account));

            depositThread.start();
            withdrawThread.start();

        }
    }

}