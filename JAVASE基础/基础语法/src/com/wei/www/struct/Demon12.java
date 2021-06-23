package com.wei.www.struct;

public class Demon12 {
    public static void main(String[] args) {
        //while 和 do...while的区别
        int a = 0;
        while (a<0){
            System.out.println(a);
            a++;
        }
        System.out.println("============================");
        do {
            a++;
            System.out.println(a);
        }while (a<0);
    }
}
