package ch3.exercise.ex4;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class IntSequence {
    public static IntSequence of(int... nums){
        return new IntSequence() {
            public void random() {
                shuffleArray(nums);
                for (int i = 0; i < nums.length; i++) {
                    System.out.print(nums[i]);
                }
            }
        };
    }

    /*
     * int 배열 랜덤 셔플 함수
     */
    public static void shuffleArray(int... ar)
    {
        Random rnd = ThreadLocalRandom.current();
        for (int i = ar.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);

            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }
}