package com.evandromurilo.concurrencyExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Evandro Murilo on 6/9/17.
 */
public class Main {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; ++i) {
            exec.execute(new RandomSleepTask());
        }
        exec.shutdown();
    }
}
