package com.peng.demon04;

public class TestSleep3 {
    public static void main(String[] args) {

        try {
            tenDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //倒计时方法
    public static void tenDown() throws InterruptedException {
        int num = 10;

        while (true){
            Thread.sleep(1000);//一秒走一下
            System.out.println(num--);
            if (num==0){
                break;
            }
        }
    }

}
