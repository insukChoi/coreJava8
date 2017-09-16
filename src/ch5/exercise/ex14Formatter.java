package ch5.exercise;


import java.io.IOException;
import java.util.logging.*;

public class ex14Formatter extends Formatter {

    @Override
    public String format(LogRecord record) {
        String rawMessage = record.getMessage();
        //rawMessage = getHead(this.fileHandler) + rawMessage + getTail(this.fileHandler);
        return rawMessage;
    }
    @Override
    public String getHead(Handler h){
        StringBuilder sb = new StringBuilder();
        sb.append("<html>");
        sb.append("<body>");
        return sb.toString();
    }
    @Override
    public String getTail(Handler h){
        StringBuilder sb = new StringBuilder();
        sb.append("</body>");
        sb.append("</html>");
        return sb.toString();
    }
}
