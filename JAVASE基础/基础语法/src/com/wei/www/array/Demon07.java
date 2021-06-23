package com.wei.www.array;

import java.util.Arrays;

public class Demon07 {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 45,5,12, 7,  75676 };
        int[] sort = sort(a);//调用完我们自己写的排序方法后，返回一个排序后的数组
        System.out.println(Arrays.toString(sort));
    }
    public static int[]sort(int[]  array){
             //临时变量
            int temp = 0;
            //外层循环 ，判断这个要走多少次
            for (int i = 0; i <array.length -1; i++) {
                //优化
                boolean flag = false;//通过flag标识位减少没有意义的比较
                //内层循环 比较判断两个数
                for(int j = 0;j<array.length-1-i;j++){
                    //如果后一个的数比前一个的数小，则交换位置
                    if (array[j+1]<array[j]){
                        temp =array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    flag  = true;
                    }
                }
           if (flag = false){
               break;
           }
            }
                  return array;
    }
}
