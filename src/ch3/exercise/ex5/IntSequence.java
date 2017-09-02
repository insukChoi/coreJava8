package ch3.exercise.ex5;

public class IntSequence {
    public static void constant(int i){
        Runnable runnable = () -> {
            while (true){
                System.out.print(i + " ");
            }
        };
        runnable.run();
    }

    public static void main(String[] args) {
        constant(1);
    }
}
