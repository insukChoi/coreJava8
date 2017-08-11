package ch2.exercise;

/**
 * Point p = new Point(3,4).translate(1,3).scale(0.5);
 */
public class ex5Main {
    public static void main(String[] args) {
        ex5 p5 = new ex5(3,4).translate(1,3).scale(0.5);
        System.out.println("점의 좌표 : x=" + p5.getX() + " , y=" + p5.getY());

        ex6 p6 = new ex6(3,4).translate(1,3).scale(0.5);
        System.out.println("점의 좌표 : x=" + p6.getX() + " , y=" + p6.getY());
    }
}
