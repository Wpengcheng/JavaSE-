package StringDate;

import org.junit.Test;

import java.util.Date;

//获取时间戳
//System类提供了currentTimeMillis()方法用来返回当前时间与1970年1月1日0时0分0秒之间以毫秒为单位的时间差
//
public class StringDateTest1 {
    @Test
    public void test1(){
        long time = System.currentTimeMillis();//此方法适用于计算时间差
        System.out.println(time);//1600010563976就是时间戳

    }
    /*
    * 两个Date类的测试   java.util.Date类  java.sql.Date类
    *1.java.util.Date类
    * 两个构造器的使用
    * 构造器一   Date()//创建了一个对应当前时间Date的对象
    * 构造器二   Date(时间戳)//创建指定毫秒数的Date对象
    *
    * 两个方法的使用
    * toString() 打印当前时间
    * getTime() 获取当前Date对象对应的时间戳
    *2.java.sql.Date类对应着数据库中的日期类型的变量
    *  》如何实例化        java.sql.Date date3 = new java.sql.Date(32345344254L);
    * java.sql.Date对象转换为java.util.Date对象(用多态直接换):  Date date3 = new java.sql.Date(32345344254L);
    * java.util.Date对象转换为java.sql.Date对象:
    * */
    @Test
    public void test2(){
        Date date1 = new Date();//创建了一个对应当前时间Date的对象
        System.out.println(date1.toString());//Mon Sep 14 08:38:21 CST 2020
        System.out.println(date1.getTime());//1600043971866

        Date date2 = new Date(1600043971866L);//创建指定毫秒数的Date对象
        System.out.println(date2);//Mon Sep 14 08:39:31 CST 2020

        //实例化
        java.sql.Date date3 = new java.sql.Date(32345344254L);
        System.out.println(date3);//1971-01-10

        //java.util.Date对象转换为java.sql.Date对象
        Date date4 = new Date();
        java.sql.Date date5 = new java.sql.Date(date4.getTime());
        System.out.println(date5);//2020-09-14



    }


}
