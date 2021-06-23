package com.wei.www.array;

public class Demon04 {
    public static void main(String[] args) {
        /*
        四行两列
        1,2      array[0]
        2,3      array[1]
        3,4      array[2]
        4,5      array[3]
         */
        int[][] array = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        //输出数组第几个元素
        printArray(array[1]);
        System.out.println();
        //输出数组里第二个元素里的第一个数
        System.out.println(array[2][0]);
        //输出数组的长度
        System.out.println(array.length);
        //输出数组里元素的长度
        System.out.println(array[2].length);
        System.out.println("=====================================");
        //遍历数组的元素
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+"\t");
            }
        }
    }
            //打印数组元素
            public static void printArray ( int[] arrays){
                for (int i = 0; i < arrays.length; i++) {
                    System.out.print(arrays[i] + "");
                }
            }
        }
