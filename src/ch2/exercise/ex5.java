package ch2.exercise;

/**
 * 평면에 놓인 점을 기술하는 불변 클래스 Point를 구현하라. 특정 점으로 설정하는 생성자와 원점으로 설정하는 인자 없는 생성자,
 * getX, getY, translate, scale 메서드를 구현하라. translate 메서드는 x와 y방향으로 주어진 길이만큼 점을 옮긴다.
 * scale 메서드는 주어진 비율로 두 좌표의 크기를 조절한다. 결과로 새로운 점을 반환하도록 이 메서드를 구현하라.
 * 예를 들어 다음 문장을 p를 좌표가 (2, 3.5)인 점으로 설정해야 한다.
 *
 *      Point p = new Point(3,4).translate(1,3).scale(0.5);
 */
public class ex5 {

    private double x;
    private double y;

    /**
     * Instantiates a new Ex 5.
     */
    public ex5(){
        x = 0;
        y = 0;
    }

    /**
     * Instantiates a new Ex 5.
     *
     * @param x the x
     * @param y the y
     */
    public ex5(double x, double y){
        this.x = x;
        this.y = y;
    }

    /**
     * Translate ex 5.
     *
     * @param moveX the move x
     * @param moveY the move y
     * @return the ex 5
     */
    public ex5 translate(double moveX, double moveY){
        return new ex5(this.x + moveX, this.y + moveY);
    }

    /**
     * Scale ex 5.
     *
     * @param rate the rate
     * @return the ex 5
     */
    public ex5 scale(double rate){
        return new ex5(this.x * rate, this.y * rate);
    }


    /**
     * Get x double.
     *
     * @return the double
     */
    public double getX(){
        return x;
    }

    /**
     * Get y double.
     *
     * @return the double
     */
    public double getY(){
        return y;
    }

}
