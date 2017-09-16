package ch5.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ex6 {
    public static void main(String[] args) throws IOException{
        /** (a) finally 절에서 예외를 잡는 방법 */
        BufferedReader in = null;
        Path path = Paths.get("src/ch5/aaa.txt");
        try {
            in = Files.newBufferedReader(path, StandardCharsets.UTF_8);
        } catch (IOException ex) {
            System.err.println("Caught IOException : " + ex.getMessage());
        } finally {
            if(in != null)
              try{  in.close(); } catch (IOException e) {
                  System.err.println("Caught IOException : " + e.getMessage());
              }
        }

        /** (b) try/finally 문을 포함하는 try/catch문 */
//        BufferedReader in = null;
//        Path path = Paths.get("src/ch5/aaa.txt");
//        try {
//            try{
//                in = Files.newBufferedReader(path, StandardCharsets.UTF_8);
//            }finally {
//                if(in != null)
//                    in.close();
//            }
//        } catch (IOException ex) {
//            System.err.println("Caught IOException : " + ex.getMessage());
//        }

        /** (c) try-with-resources 문 */
//        Path path = Paths.get("src/ch5/aaa.txt");
//        try (BufferedReader in = Files.newBufferedReader(path, StandardCharsets.UTF_8)){
//            // DO Something
//        }


    }
}
