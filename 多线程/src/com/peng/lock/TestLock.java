package com.peng.lock;

import java.util.concurrent.locks.ReentrantLock;

//测试lock锁
public class TestLock {
    public static void main(String[] args) {
        TestLock2 testLock2 = new TestLock2();
        new Thread(testLock2).start();
        new Thread(testLock2).start();
        new Thread(testLock2).start();
    }
}

class TestLock2 implements Runnable{

    int ticketNums = 10;
    // 定义lock锁     ReentrantLock是Lock接口的实现类
    private final ReentrantLock lock = new ReentrantLock();

    @Override
    public  void run() {

        while (true){
            try{
                //加锁，在要变化的量加锁
                lock.lock();
                if (ticketNums>0){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(ticketNums--);
                }else {
                    break;
                }

            }finally {
                //解锁   把解锁放在finally里
                lock.unlock();
            }
        }

    }
}