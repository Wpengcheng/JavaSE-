package com.peng.base;

public class Demon04 {
    public static void main(String[] args) {
        int monay = 1000000000;
        int years = 20;
        long total = (long)(monay * years);
        System.out.println(total);//-1474836480，计算时内存溢出，因为计算结果默认是int类型
        long total1 = (long)monay * (long)years;//先把一个数转换为long类型
        System.out.println(total1);
    }
}


