package com.wei.www.method;

public class Demon05 {
    public static void main(String[] args) {
        //实际参数，实际调用传递给其他参数
        double sum = add(1.1,2);// 通过add调用下面add语句的方法
        System.out.println(sum);

    }
    //形式参数，用来定义作用的
    //加法,放在main方法外面，使main方法更简洁
    //修饰符
    public static int add(int a,int b){
        return  a+b; //返回a+b的值
    }





    public static double add(double a,double  b){
        return  a+b; //返回a+b的值

    }


}
