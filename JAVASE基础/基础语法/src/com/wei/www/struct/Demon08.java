package com.wei.www.struct;

public class Demon08 {
    public static void main(String[] args) {
        //表达式的结果可以是字符串
        //字符的本质还是数字
        //反编译  java---》class(字节码文件)，反编译可以用IDEA实行
        String name = "后裔" ;
        switch (name){
            case "虞姬":
                System.out.println("擅长的英雄为："+name);
                break;
            case "张飞":
                System.out.println("擅长的英雄为："+name);
                break;
            case "后裔":
                System.out.println("擅长的英雄为："+name);
                break;
            case "甄姬":
                System.out.println("擅长的英雄为："+name);
                break;
            case "狂铁":
                System.out.println("擅长的英雄为："+name);
                break;
            default:
                System.out.println("不会的英雄");
        }
    }
}
