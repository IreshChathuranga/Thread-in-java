package org.example;

public class Main {
    public static void main(String[] args) {
        A a =new A();
        B b =new B();
        a.start();
        try{
            Thread.sleep(10);
        }catch (InterruptedException e){
            throw new RuntimeException();
        }
        b.start();
    }
}

class A extends Thread{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("A");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                throw new RuntimeException();
            }
        }
    }
}

class B extends Thread{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("B");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                throw new RuntimeException();
            }
        }
    }
}
