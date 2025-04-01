package org.example;

public class ExtendThreadClass {
    public static void main(String[] args) {
            MyThread myThread = new MyThread();
            myThread.start(); //start thread
    }
}
class MyThread extends Thread {
    @Override
    public void run() {//run thread
        System.out.println("Hello world!");
    }
}