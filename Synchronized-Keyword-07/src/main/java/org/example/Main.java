package org.example;

public class Main {
    public static int i;
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            for(int i=1;i<=1000;i++) {
                increment();
            }
        }
        );
        t1.start();
        t1.join();

        Thread t2 = new Thread(()->{
            for(int i=1;i<=1000;i++) {
               increment();
            }
        }
        );
        t2.start();
        t2.join();
        System.out.println(i);
    }
    public static synchronized void increment() {
        i++;
    }
}