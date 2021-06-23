package com.cheng.www.HomeWork;


import java.util.Scanner;

public class Work01 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要计算的第一个数字：");
        int a = scanner.nextInt();
        System.out.println("请输入要计算的第二个数字：");
        int b = scanner.nextInt();
        System.out.println("求和输入1,求差输入2,求积输入3,求商输入4:");
        int c = scanner.nextInt();
        if (c==1) {
            System.out.println("和为："+(a+b));
        }
        else if(c==2) {
            System.out.println("差为："+(a-b));
        }
        else if(c==3) {
            System.out.println("积为："+(a*b));
        }
        else if(c==4) {
            System.out.println("商为："+(a/b));
        }
        else{
            System.out.println("符号输入错误！");
        }
    }
}






