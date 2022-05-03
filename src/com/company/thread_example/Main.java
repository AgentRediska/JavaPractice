package com.company.thread_example;

import java.util.concurrent.*;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
       // executorServiceExample();
        System.out.println("*******************");

      //  semaphoreExample();
        System.out.println("*******************");

      //  countDownLatchExample();
        System.out.println("*******************");

      //  cyclicBarrierExample();
        System.out.println("*******************");

        readWriteLockExample();
    }

    public static void executorServiceExample() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Object> future = executorService.submit(() -> {
            System.out.println("asynchronous executor");
            return "Result from thread";
        });
        System.out.println("future.get() = " + future.get());
        executorService.shutdown();
    }

    public static void semaphoreExample() {
        Semaphore semaphore = new Semaphore(2);
        for (int i = 0; i < 5; i++) {
            final int w = i;
            new Thread(() -> {
                try {
                    System.out.println("Thread " + w + " before semaphore");
                    semaphore.acquire();
                    System.out.println("Thread " + w + " take access");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    System.out.println("Thread " + w + " after semaphore");
                    semaphore.release(2);
                }
            }).start();
        }
    }

    public static void countDownLatchExample() {

        final int THREAD_COUNT = 6;
        final CountDownLatch countDownLatch = new CountDownLatch(THREAD_COUNT);
        System.out.println("START!!!");

        for (int i = 0; i < THREAD_COUNT; i++) {
            final int w = i;
            new Thread(() -> {
                try {
                    Thread.sleep(500 + (int) (500 * Math.random()));
                    countDownLatch.countDown();
                    System.out.println("Thread #" + w + " is ready");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Finished");
    }

    public static void cyclicBarrierExample() {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3);
        for (int i = 0; i < 3; i++) {
            final int w = i;
            new Thread(() -> {
                try {
                    System.out.println("Thread " + w + " ready");
                    Thread.sleep(100 + (int) (3000 * Math.random()));
                    System.out.println("Thread " + w + " is reading");
                    cyclicBarrier.await();
                    System.out.println("Thread " + w + " was started");
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }

    public static void readWriteLockExample() {
        ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        System.out.println("Reader was adding");
        readWriteLock.readLock().lock();
        System.out.println("Reader was going out");
        readWriteLock.readLock().unlock();
        System.out.println("Writer was adding");
        readWriteLock.writeLock().lock();
        System.out.println("Reader was going out");
        readWriteLock.writeLock().unlock();
    }
}

