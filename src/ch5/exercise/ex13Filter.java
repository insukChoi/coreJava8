package ch5.exercise;

import java.util.logging.Filter;
import java.util.logging.LogRecord;

public class ex13Filter implements Filter{
    @Override
    public boolean isLoggable(LogRecord record) {
        String rawMessage = record.getMessage();
        rawMessage = rawMessage.replaceAll("sex", "");
        rawMessage = rawMessage.replaceAll("drug", "");
        rawMessage = rawMessage.replaceAll("C\\+\\+", "");
        record.setMessage(rawMessage);
        return false;
    }
}
