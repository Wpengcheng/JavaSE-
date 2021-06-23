package com.wei.www.method;

public class Demon07 {
    public static void main(String[] args) {
        //调用可变参数的方法
        printMax(2,3,4,6,7,89,8);
        printMax(new double[]{1,2,3,88});


    }
    public static void printMax(double...numbers){

        if (numbers.length==0){
            System.out.println("no argument passed");
            return;
        }
        double result = numbers[0];
        //排序
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i]>result){
                result=numbers[i];
        }
        }
        System.out.println("the max value is" + result);
    }
}

