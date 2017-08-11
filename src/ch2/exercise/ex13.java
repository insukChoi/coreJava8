package ch2.exercise;

import com.opencsv.CSVReader;
import java.io.FileReader;

/**
 * 먼저 http://opencsv.sourceforge.net 에서 openCSV 의 jar 파일을 내려받는다. 여러분이 선택한 CSV 파일을 읽고 내용 일부를 출력하는
 * main 메서드를 포함하는 클래스를 작성하라. OpenCSV 웹 사이트에 예제 코드가 있다. 예외를 처리하는 방법은 아직 배우지 않았으니
 * main 메서드에서 다음 선언부를 사용하자.
 *  public static void main(String[] args) throws Exception
 * 이 연습문제는 CSV 파일로 유용한 작업을 하는 것보다는 JAR 파일로 배포되는 라이브러리 사용을 실습해보는 것이 목적이다.
 */
public class ex13 {
    public static void main(String[] args) throws Exception{
        CSVReader reader = new CSVReader(new FileReader("D:\\workspace_intelliJ\\CoreJava8\\src\\ch2\\LocationsImportSample.csv"));
        String [] nextLine;
        while ((nextLine = reader.readNext()) != null) {
            // nextLine[] is an array of values from the line
            System.out.println(nextLine[0] + nextLine[1] + "etc...");
        }
    }
}
