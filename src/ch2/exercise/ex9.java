package ch2.exercise;


/**
 * x 축을 따라 이동하며 가스를 소비하는 자동차를 모델링하는 Car 클래스를 구현하라.
 * 지정한 마일(mile)만큼 드라이브하는 메서드, 지정한 수만큼 가스 탱크에 갤런을 채우는 메서드,
 * 원점과 연료 레벨로 현재 거리를 구하는 메서드를 구현하라.
 * 생성자에 갤런당 마일 단위(miles/gallons)로 연료 효율성을 지정하라.
 * 불변 클래스로 만들어야 하는가? 그렇거나 그렇지 않은 이유를 제시하라.
 */
public final class ex9 {
    // final class 인 이유는 해당 클래스는 상속이 되지 않게 하기 위함이다.

    private double miles;
    private double gallon;
    private double effectiveness;

    /**
     * Instantiates a new Ex 9.
     *
     * @param miles  the miles
     * @param gallon the gallon
     */
    public ex9(double miles, double gallon) {
        this.effectiveness = miles / gallon;
    }

    /**
     * Move this Car depend on gallon
     *
     * @param mile the mile
     */
    public void move(double mile){
        try{
            if(mile > this.effectiveness * this.gallon){
                throw new Exception("Not enough GAS");
            }
            this.miles += mile;
            this.gallon = this.gallon - (mile / this.effectiveness);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Put gallon.
     *
     * @param gas the gas
     */
    public void putGallon(double gas){
        this.gallon += gas;
    }

    /**
     * Get distance double.
     *
     * @return the double miles
     */
    public double getDistance(){
        return this.miles;
    }

    /**
     * Get gallon double.
     *
     * @return the double gallon
     */
    public double getGallon(){
        return this.gallon;
    }

    /**
     * Get effectiveness double.
     *
     * @return the double effectiveness
     */
    public double getEffectiveness(){
        return this.effectiveness;
    }

}
