package ch4.exercise.ex1ex2ex3;

public class Main {
    public static void main(String[] args) {
        LabeledPoint P1 = new LabeledPoint("insuk",5,4);
        LabeledPoint P2 = new LabeledPoint("insuk",8,2);

        System.out.println("P1.equals(P2) = "+ P1.equals(P2));
        System.out.println("P1.hashCode() = "+ P1.hashCode());
        System.out.println("P2.hashCode() = "+ P2.hashCode());

        // equals() 로 비교시 두개의 오브젝트가 같다면, hashCode() 값도 같아야 한다.
        // equals() 로 비교시 false 라면, hashCode() 값은 다를수도, 같을수도 있다. 그러나 성능을 위해서는 hashCode() 값이 다른것이 낫다. 그래야 해싱 알고리즘으로 Set 에 해당 오브젝트가 존재하는지 아닌지 빠르게 검색할 수 있다.
    }
}
