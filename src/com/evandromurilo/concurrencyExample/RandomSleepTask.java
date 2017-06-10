package com.evandromurilo.concurrencyExample;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Created by Evandro Murilo on 6/9/17.
 */
public class RandomSleepTask implements Runnable{
    static int taskCount = 0;
    int id = taskCount++;
    int sleepSeconds = new Random().nextInt(10)+1;

    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(sleepSeconds);
        } catch (InterruptedException e) {
            System.err.println("Interrupted.");
        }
        System.out.println("I slept for " + sleepSeconds + " seconds! (#" + id + ")");
    }
}