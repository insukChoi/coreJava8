package ch5;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Demo {
    public static void main(String[] args) throws FileNotFoundException{

        try(PrintWriter pw = new PrintWriter("aaa.txt")){
            Logger logger = Logger.getLogger("com.infuk");
            logger.setLevel(Level.ALL);
            logger.warning("gogo");
        }
    }
}
