package ch5.exercise;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ex5 {

    public static void main(String[] args){
        try {
            Scanner in = new Scanner(Paths.get("D:\\UltraEdit_Ver.15\\ultraedit_serial.txt"));
            PrintWriter out = new PrintWriter("src/ch5/output.txt");
            while (in.hasNext()){
                out.println(in.next().toLowerCase());
            }
            out.close();
            in.close();
        } catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
        } catch (IOException ioe){
            ioe.printStackTrace();
        } catch (IllegalStateException ie){
            ie.printStackTrace();
        } catch (NoSuchElementException nse){
            nse.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
