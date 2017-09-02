package ch4.exercise.ex7;

/**
 * Created by admin on 2017-09-02.
 */
public enum Collor {
    // 검정
    BLACK ("BLACK"),
    // 빨강
    RED ("RED"),
    // 파랑
    BLUE ("BLUE"),
    // 초록
    GREEN ("GREEN"),
    // 시안
    CYAN ("CYAN"),
    // MAGENTA
    MAGENTA ("MAGENTA"),
    // 노랑
    YELLOW ("YELLOW"),
    // 흰색
    WHITE ("WHITE");

    private String color;

    Collor(String color){
        this.color = color;
    }

    public String getColor(){
       return this.color;
    }

    public Collor getRed(){
        return Collor.RED;
    }
    public Collor getGreen(){
        return Collor.GREEN;
    }
    public Collor getBlue(){
        return Collor.BLUE;
    }

}
