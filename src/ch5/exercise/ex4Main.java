package ch5.exercise;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ex4Main {
    public static void throwInsukIO() throws ex4Exception {
        throw new ex4Exception(ex4ExceptionCode.IO_EXEPTION_CODE);
    }
    public static void throwInsukNumberFormat() throws ex4Exception {
        throw new ex4Exception(ex4ExceptionCode.NUMBERFORMAT_EXEPTION_CODE);
    }

    public static void main(String[] args) {
        Logger logger = Logger.getLogger("com.insuk");
        logger.setLevel(Level.INFO);
        ex2 ex2 = new ex2();
        try{
            System.out.println(ex2.sumOfValues("src/ch5/aaa.txt"));
        } catch (IOException ioe){
           try {
               throwInsukIO();
           } catch (ex4Exception ex4E){
               ex4E.printStackTrace();
           }
        }
    }

    public double sumOfValues(String filename){
        ex1 ex1 = new ex1();
        double sumVal = 0.0;
        ArrayList<Double> numbers = null;
        try {
            numbers = ex1.readValues(filename);
        } catch (IOException e){
            try {
                throwInsukIO();
            } catch (ex4Exception ex4E){
                ex4E.printStackTrace();
            }
        }
        for (Double dVal : numbers) {
            sumVal += dVal;
        }
        return sumVal;
    }

    public ArrayList<Double> readValues(String filename){
        ArrayList<Double> numbers = new ArrayList<>();
        try{
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line = reader.readLine();
            while (line != null) {
                try {
                /* Integer value 이면 배열에 넣지 않는다. */
                    Integer.valueOf(line);
                } catch (NumberFormatException ex) {
                    try{
                    /* Double 이면 배열에 넣는다. */
                        numbers.add(Double.valueOf(line));
                    }catch (NumberFormatException efe){
                        try {
                            throwInsukNumberFormat();
                        } catch (ex4Exception ex4E){
                            ex4E.printStackTrace();
                        }
                    }
                }
                line = reader.readLine();
            }
        } catch (IOException e){
            try {
                throwInsukIO();
            } catch (ex4Exception ex4E){
                ex4E.printStackTrace();
            }
        }
        return numbers;
    }
}
