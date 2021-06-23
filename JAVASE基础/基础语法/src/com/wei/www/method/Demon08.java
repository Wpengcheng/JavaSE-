package com.wei.www.method;

public class Demon08 {
    //学习递归的思想
    public static void main(String[] args) {
        System.out.println(f(30));

    }
    public static int f(int n){
        if (n==1){
            return 1;
        }else{
            return n*f(n-1);
        }
    }
}
