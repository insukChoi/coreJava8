package ch5.exercise;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ex13 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(ex13.class.getName());
        ConsoleHandler handler = null;

        try {
            handler = new ConsoleHandler();
            handler.setFilter(new ex13Filter());
        } catch (Exception e) {
            logger.log(Level.SEVERE, "로그 핸들러 생성에 실패했습니다.", e);
        }
        logger.addHandler(handler);

        // 테스트 코드
        logger.info("sex message");
        logger.info("drug message");
        logger.info("java message");
        logger.info("C++ message");
    }
}
