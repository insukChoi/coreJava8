package ch5.exercise;

import java.io.*;
import java.util.ArrayList;

public class ex1 {
    public ArrayList<Double> readValues(String filename) throws IOException {
        ArrayList<Double> numbers = new ArrayList<>();
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
                    throw new NumberFormatException();
                }
            }
            line = reader.readLine();
        }
        return numbers;
    }
}
