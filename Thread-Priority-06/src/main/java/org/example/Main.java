package org.example;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(() ->{
            for(int i=0;i<10;i++){
                System.out.println("A");
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    throw new RuntimeException();
                }
            }
        });
        Thread t2 = new Thread(() ->{
            for(int i=0;i<10;i++){
                System.out.println("B");
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    throw new RuntimeException();
                }
            }
        });
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.NORM_PRIORITY);
        t1.setPriority(10);
        t2.setPriority(1);
        t1.setPriority(5);
        t1.start();
        t2.start();
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread());
        t1.setName("Lahiru");
        t1.setName("Sahan");

    }
}