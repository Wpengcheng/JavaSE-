package com.peng.demon01;

//创建线程方式2,：实现Runnable接口,重写run方法，执行线程需要丢入Runnable接口的实现类，调用start开启线程
public class TestThread03 implements Runnable{
    @Override
    public void run() {
        //线程体
        for (int i = 0; i <200; i++) {
            System.out.println("打王者荣耀"+i);
        }
    }
    public static void main(String[] args) {//main()线程，主线程

        //创建一个Runnable接口的实现类的对象
        TestThread03 testThread03 = new TestThread03();
        //创建线程对象，通过线程对象来开启线程
        // Thread new = new Thread(testThread03);
        //new Thread.start();
        new Thread(testThread03).start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("不要打英雄联盟"+i);
        }
    }
}


