package ch2.exercise;

import java.util.Date;

import static java.lang.System.*;
import static java.time.LocalDate.*;

/**
 * Car 클래스를 다시 작성해서 System 과 LocalDate 클래스에 정적 임포트를 사용하도록 하라.
 */
public class ex11 {
    private double miles;
    private double gallon;
    private double effectiveness;

    /**
     * Instantiates a new Ex 11.
     *
     * @param miles  the miles
     * @param gallon the gallon
     */
    public ex11(double miles, double gallon) {
        this.effectiveness = miles / gallon;
        out.println("효율성 : " + this.effectiveness);
        out.println("현재 날짜 : " + now());
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
