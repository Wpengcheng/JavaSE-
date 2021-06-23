package com.cheng.www.HomeWork;

public class Work03 {
    public static void main(String[] args) {
        //目标：打印出一个稀疏数组并还原
        //1.先创建一个二维数组array1,假设二维数组的有效值为19,99,8,2   位置分别位于{2,3}，{5,6}，{7,2}，{6,0}
        int[][]array1 = new int[12][12];
        //打印有效值的坐标
        array1[2][3] = 19;
        array1[5][6] = 99;
        array1[8][2] = 8 ;
        array1[6][0] = 2 ;
        //输出原始数组
        System.out.println("原始数组为 ");
        for (int[] ints : array1) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
        System.out.println("===========================================================");
        //2.统计有效值的个数
        //先定义一个字符来存放有效值的个数
        int sum = 0 ;
        //对数组元素进行判断，如果元素不为0则有效值加1
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
               if (array1[i][j] != 0) {
                    sum++;
                }
            }
        }
        System.out.println("有效值个数为："+sum);
        //创建一个稀疏数组array2  稀疏数组行数为有效值数+1，列数固定为3
        int [][] array2 = new int[sum+1][3];
        //打印出第一行
        array2[0][0] = 12;
        array2[0][1] = 12;
        array2[0][2] = sum;
        //遍历二维数组，将非零值存放到稀疏数组中
        int count = 0;//存放有效值的横坐标
        for (int i = 0; i <array1.length ; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if (array1[i][j]!=0){
                    count++;
                    array2[count][0] = i;//横坐标
                    array2[count][1] = j;//纵坐标
                    array2[count][2] = array1[i][j];//有效值
                }
            }
        }
        //输出稀疏数组
        System.out.println("===========================================================");
        System.out.println("稀疏数组为");
        for (int i = 0; i <array2.length ; i++) {
            System.out.println(array2[i][0] + "\t"//输出第一列
                    + array2[i][1] + "\t"//输出第二列
                    + array2[i][2] + "\t");//输出第三列
        }
        System.out.println("===========================================================");
        System.out.println("原二维数组为");
        //还原成原来的数组
        //1.读取稀疏数组（还原有效值的坐标）
        int [][] array3 = new  int[array2[0][0]][array2[0][1]];
        //2.给其中的元素还原它的值
        for (int i = 1; i <array2.length ; i++) {
            array3[array2[i][0]][array2[i][1]] = array2[i][2];
        }
        //3.打印
        System.out.println("输出还原数组");
        for (int[] ints : array1) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }









        }
    }

