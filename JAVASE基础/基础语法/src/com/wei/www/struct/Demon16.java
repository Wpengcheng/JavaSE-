package com.wei.www.struct;

public class Demon16 {
    public static void main(String[] args) {
        //用for循环输出1-1000之间能被5整除的数，并且每行输出3个

        for (int i = 0; i < 1000; i++) {
            if(i%5==0){
                System.out.print(i+"\t");//每输出了一个数就会自动空格
            }
            if (i%(5*3)==0){
                System.out.println();//每行输出3个并且会自动换行
              //  或者System.out.print("\n");都可以实现换行
            }//println   输出完换行
             //print    输出完不换行

        }
    }
}
