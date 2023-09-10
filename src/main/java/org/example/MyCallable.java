package org.example;

import java.util.Random;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    private final static Random random = new Random();

    @Override
    public Integer call() {
        int count = 0;
        for (int i = 0; i < 10; i++) {

            System.out.println("Hello everyone! I am thread " + Thread.currentThread().getName());
            ++count;
            try {
                Thread.sleep(random.nextInt(2000, 3000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.printf("%s zavershen\n", Thread.currentThread().getName());
        return count;
    }
}
