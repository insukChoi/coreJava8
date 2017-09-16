package ch5.exercise;

import java.io.IOException;
import java.util.ArrayList;

public class ex2 {
    public double sumOfValues(String filename) throws IOException{
        ex1 ex1 = new ex1();
        double sumVal = 0.0;
        ArrayList<Double> numbers = ex1.readValues(filename);
        for (Double dVal : numbers) {
            sumVal += dVal;
        }
        return sumVal;
    }
}
