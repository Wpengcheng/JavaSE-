package com.wei.www.method;

public class Demon04 {
    public static void main(String[] args) {
    // 返回值类型    方法名称   参数
       double min= min(80.66,40, 40);
        System.out.println(min);
       //返回值为double，则输出double类型
       // 返回值为int，则输出int类型
    }
    public static double min(double a,double b ,double c ){
       double result = 0;
        if (a>b){
            result =b;
        } else if (a < b) {
            result = a;
        } else if (a == b) {
            System.out.println("a==b");
            return 0;//终止方法
        }
            return  result;
    }
    //==================================================================
    public static int min(int a,int b,int c) {
        int result = 0;
        if (a > b+c ) {
            result = a;
        } else if (a < b+c) {
            result = b;
        } else if (a == b+c) {
           result=c;
            return 0;//终止方法
    }
             return  result;
}
}











