package com.wei.www.array;

public class Demon05 {
    public static void main(String[] args) {
        //静态初始化: 创建和赋值一起完成
        int[]a = {1,2,3,4,5,6,7,8,};
        System.out.println(a[0]);


          //动态初始化  包含默认初始化
   int[]b = new int[10];
   b[0]=10;
        System.out.println(b[0]);
        System.out.println(b[1]);


    }
}
