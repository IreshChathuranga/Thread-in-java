package org.example;

public class ImplementRunableInterface {
    public static void main(String[] args) {
        MynewThread mynewThread = new MynewThread();
        Thread thread = new Thread(mynewThread);
        thread.start();
    }
}


class MynewThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello world!");
    }
}
