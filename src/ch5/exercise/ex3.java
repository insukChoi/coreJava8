package ch5.exercise;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ex3 {
    public static void main(String[] args){
        Logger logger = Logger.getLogger("com.insuk");
        logger.setLevel(Level.INFO);
        ex2 ex2 = new ex2();
        try{
            System.out.println(ex2.sumOfValues("src/ch5/aaa.txt"));
        } catch (IOException ioe){
            logger.warning("입출력 에러입니다~");
        }
    }
}
