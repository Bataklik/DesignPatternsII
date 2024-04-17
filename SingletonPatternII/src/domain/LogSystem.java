package domain;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class LogSystem {

    private static LogSystem instance;
    private Map<LocalDateTime, LogMessage> logMessages;

    private LogSystem() {
        logMessages = new HashMap<>();
    }

    public static LogSystem getInstance() {
        if (instance == null) {
            instance = new LogSystem();
        }
        return instance;
    }

    public void log(LogLevels type, String message) {
        LogMessage logMessage = new LogMessage(type, LocalDateTime.now(), message);
        logMessages.put(logMessage.getDate(), logMessage);
    }

    public void printLogMessages() {
        for (Map.Entry<LocalDateTime, LogMessage> entry : logMessages
                .entrySet()) {
            System.out.println(entry.getValue());
        }
    }

}