package com.wei.www.struct;

public class   Demon17 {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};
        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);//普通for循环

        }
        System.out.println("==========================");
        //遍历数组的元素
        for (int x :numbers){
            System.out.println(x);//增强for循环
        }

    }
}