package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws Exception {
        final ExecutorService threadPool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        List<Callable<Integer>> callables = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            callables.add(new MyCallable());
        }
        //List<Future<Integer>> futures = threadPool.invokeAll(callables);
        System.out.println(threadPool.invokeAny(callables));
        threadPool.shutdown();
//        for (int i = 0; i < futures.size(); i++) {
//            System.out.println(futures.get(i) + " napisal " + futures.get(i).get() + " raz");
//        }
    }
}