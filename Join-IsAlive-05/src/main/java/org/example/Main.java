package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            for(int i=0;i<10;i++) {
                System.out.println("Thead 1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException();
                }
            }
        }
        );
        Thread t2 = new Thread(()->{
            for(int i=0;i<10;i++) {
                System.out.println("Thead 2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException();
                }
            }
        }
        );
        t1.start();
        System.out.println(t2.isAlive());
        try{
            Thread.sleep(10);
        }catch (InterruptedException e){
            throw new RuntimeException();
        }
        t2.start();
        System.out.println(t2.isAlive());

        t1.join();
        System.out.println(t2.isAlive());

        t2.join();
        System.out.println(t2.isAlive());

        System.out.println("BYE");
        System.out.println(t2.isAlive());

    }
}