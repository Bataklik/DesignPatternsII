package cui;

import domain.LogLevels;
import domain.LogSystem;

public class Client {
    private LogSystem logSystem;

    public static void main(String[] args) throws InterruptedException {
        new Client().run();
    }

    public void run() throws InterruptedException {
        logSystem = LogSystem.getInstance();
        logSystem.log(LogLevels.INFO, "Hello");
        Thread.sleep(1000);
        logSystem.log(LogLevels.WARNING, "Say Hello Back");
        logSystem.printLogMessages();
    }
}