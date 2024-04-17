package domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogMessage {

    private LogLevels level;
    private LocalDateTime date;
    private String message;

    public LogMessage(LogLevels level, LocalDateTime date, String message) {
        setLevel(level);
        setDate(date);
        setMessage(message);
    }

    public LogLevels getLevel() {
        return this.level;
    }


    private void setLevel(LogLevels level) {
        this.level = level;
    }

    public LocalDateTime getDate() {
        return this.date;
    }


    private void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getMessage() {
        return this.message;
    }


    private void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedTimestamp = date.format(formatter);
        return String.format("[%s] [%s] %s", formattedTimestamp, level, message);
    }
}