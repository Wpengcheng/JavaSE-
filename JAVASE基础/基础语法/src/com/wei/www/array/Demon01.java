package com.wei.www.array;

public class Demon01 {
    public static void main(String[] args) {
        int[] nums;//声明一个数组
        nums = new int[10];//创建一个数组
        //声明和创建一个数组 int[] nums = new int[10]
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;
        nums[5] = 6;
        nums[6] = 7;
        nums[7] = 8;
        nums[8] = 9;
        nums[9] = 10;
        //求和
        int sum = 0;
        //获取数组长度：arrays.length
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        System.out.println("总和为："+sum);
        }
    }

