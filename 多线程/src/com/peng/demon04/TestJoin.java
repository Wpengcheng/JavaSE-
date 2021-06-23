package com.peng.demon04;

import javax.swing.*;

//测试join方法
public class TestJoin implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 300; i++) {
            System.out.println("vip线程来了"+i);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        TestJoin testJoin = new TestJoin();
        Thread thread = new Thread(testJoin);
        thread.start();

        //主线程的线程体
        for (int i = 1; i <= 500; i++) {
            if (i==100){//i=100时,就去执行TestJoin线程
                thread.join();
            }
            System.out.println("main线程执行"+i);
        }

    }
}
