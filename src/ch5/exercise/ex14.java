package ch5.exercise;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ex14 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(ex14.class.getName());
        FileHandler handler = null;
        try {
            handler = new FileHandler("src/ch5/ex14.html");
            handler.setFormatter(new ex14Formatter());
        } catch (Exception e) {
            logger.log(Level.SEVERE, "로그 핸들러 생성에 실패했습니다.", e);
        }
        logger.addHandler(handler);

        // 테스트 코드
        logger.info("Let's make HTML !!! ");
    }
}
