package com.peng.demon04;


import java.text.SimpleDateFormat;
import java.util.Date;


public class TestSleep2 {
    public static void main(String[] args) {

        //打印系统当前时间
        Date startTime = new Date(System.currentTimeMillis());//获取系统当前时间

        while (true){
            try {
                Thread.sleep(1000);
                System.out.println(new SimpleDateFormat("HH:mm:ss").format(startTime));
                startTime=new Date(System.currentTimeMillis());//更新当前时间
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}


