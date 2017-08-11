package ch2.exercise;

/**
 * Created by admin on 2017-08-10.
 */
public class ex9Main {
    public static void main(String[] args) {
        ex9 car = new ex9(500, 100);

        System.out.println("자동차 연료 효울성 : " + car.getEffectiveness());

        System.out.println("현재 거리 = " + car.getDistance());
        System.out.println("현재 가스 = " + car.getGallon());

        System.out.println("\n100가스 충전\n");
        car.putGallon(100);

        System.out.println("현재 거리 = " + car.getDistance());
        System.out.println("현재 가스 = " + car.getGallon());

        System.out.println("\n100마일 이동\n");
        car.move(100);

        System.out.println("현재 거리 = " + car.getDistance());
        System.out.println("현재 가스 = " + car.getGallon());

    }
}
