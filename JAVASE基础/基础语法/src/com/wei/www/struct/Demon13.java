package com.wei.www.struct;

public class Demon13 {
    public static void main(String[] args) {
        /*打印九九乘法表
        1.先打印第一列
        2.把固定的1用一个循环包起来
        3.去掉重复 j<=i
        4. 调整格式
         */

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"*"+i+"="+(j*i) + "\t");

            }

            System.out.println();
        }

    }
}
