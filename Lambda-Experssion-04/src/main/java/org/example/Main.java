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
        t1.start();
        try{
            Thread.sleep(10);
        }catch (InterruptedException e){
            throw new RuntimeException();
        }
        t2.start();
    }
}
