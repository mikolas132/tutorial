package com.com.training.Threads;

public class DeadlockTest {
    public static Object lock1 = new Object();
    private static Object lock2 = new Object();

    public static void main(String[] args) {
        new ThreadExample().start();
        new ThreadExample2().start();
    }
    private static class ThreadExample extends Thread{
        public void run() {
            synchronized (lock1) {
                System.out.println("Thread 1: locked 1");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1: waiting for locked 2");
                synchronized (lock2){
                    System.out.println("thread1 : locked 1 and locked 2");
                }
            }
        }
    }
    private static class ThreadExample2 extends Thread{
        public void run() {
            synchronized (lock2) {
                System.out.println("Thread 2: locked 2");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2: waiting for locked 1");
                synchronized (lock1){
                    System.out.println("thread1 : locked 2 and locked 1");
                }
            }
        }
    }
}
