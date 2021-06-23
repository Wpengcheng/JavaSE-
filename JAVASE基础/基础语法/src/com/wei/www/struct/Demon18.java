package com.wei.www.struct;

public class Demon18 {
    public static void main(String[] args) {
        int i =0;
        while (i<100) {
            i++;
            if (i % 10 == 0) {//当到十时就会进行下一次循环
                System.out.println();//执行一个循环后空一行
                continue;
            }
                System.out.print(i+ "\t" );

        }
    }
}
