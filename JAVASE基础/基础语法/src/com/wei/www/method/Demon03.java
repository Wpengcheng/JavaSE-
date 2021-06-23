package com.wei.www.method;

public class Demon03 {
    public static void main(String[] args) {
        double min= min(80.1,80.11);
        System.out.println(min);


    }

    public static double min(double a,double b){
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



}











