package com.wei.www.array;

public class Demon03 {
    public static void main(String[] args) {
        int[] arrays = {1, 2, 3, 4, 5};
        //增强型for循环,可以打印数组元素，但没有下标
        //    for (int array : arrays) {
        //       System.out.println(array);
        //  }
        int[] reverse = reverse(arrays);
        printArray(arrays);
        System.out.println("===========================");
        printArray(reverse);
    }
   //数组作为方法入参
    //打印全部的数组元素
   public static void printArray(int[] arrays) {
       for (int i = 0; i < arrays.length; i++) {
           System.out.println(arrays[i] + "");
        }
    }
    //数组做返回值
    //反转数组
    public static int[] reverse(int[] arrays){
        int[] result = new int[arrays.length];
       //反转的操作
        for (int i = 0,j=result.length-1; i <arrays.length ;j--, i++) {
            result[j] = arrays[i];
        }
        return result;
    }
}
