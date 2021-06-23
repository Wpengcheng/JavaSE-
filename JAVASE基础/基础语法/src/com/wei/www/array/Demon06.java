package com.wei.www.array;
import java.util.Arrays;
public class Demon06 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,7,9,67,56,434};
        //打印数组元素Arrays.toString
        System.out.println(Arrays.toString(a));
        printArray(a);
    }
             public  static void printArray(int[]a) {
                 for (int i = 0; i < a.length; i++) {
                     if (i == 0) {
                         System.out.print("[");
                     }
                     if (i == a.length - 1) {
                         System.out.print(a[i] + "]");
                     } else {
                         System.out.print(a[i] + ", ");
                     }
                 }
                 System.out.println();
                 System.out.println("==============================");
                 Arrays.sort(a);    //对数组进行排序
                 System.out.println(Arrays.toString(a));
                 System.out.println("==============================");
                 //数组填充
                // Arrays.fill(a,0);
               //  System.out.println(Arrays.toString(a));
                 //数组中2到4的元素被填充
                 Arrays.fill(a,2,4,1);
                 System.out.println(Arrays.toString(a));
             }

}
