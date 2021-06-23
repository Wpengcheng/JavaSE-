package com.peng.cny;

import java.util.concurrent.CopyOnWriteArrayList;

//测试JUC包下的安全类型的集合
public class TestJUC {
    public static void main(String[] args) {
        //CopyOnWriteArrayList这个类的线程是安全的
        CopyOnWriteArrayList<String> list = new  CopyOnWriteArrayList<String>();
        for (int i = 0; i < 10000; i++) {
            new Thread(()->{
                list.add(Thread.currentThread().getName());

            }).start();
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(list.size());
    }

}
