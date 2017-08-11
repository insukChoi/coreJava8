package ch2.exercise;

/**
 * 연습문제 5번을 반복하되 이번에는 translate 와 scale을 변경자로 만들라.
 */
public class ex6 {
    private double x;
    private double y;

    /**
     * Instantiates a new Ex 6.
     */
    public ex6(){
        x = 0;
        y = 0;
    }

    /**
     * Instantiates a new Ex 6.
     *
     * @param x the x
     * @param y the y
     */
    public ex6(double x, double y){
        this.x = x;
        this.y = y;
    }

    /**
     * Translate ex 6.
     *
     * @param moveX the move x
     * @param moveY the move y
     * @return the ex 6
     */
    public ex6 translate(double moveX, double moveY){
        this.x += moveX;
        this.y += moveY;

        return this;
    }

    /**
     * Scale ex 6.
     *
     * @param rate the rate
     * @return the ex 6
     */
    public ex6 scale(double rate){
        this.x = this.x * rate;
        this.y = this.y * rate;

        return this;
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
