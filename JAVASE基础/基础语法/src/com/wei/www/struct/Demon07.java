package com.wei.www.struct;

public class Demon07 {
    public static void main(String[] args) {
         //先输入一个值
        char grade = 'g';
        //swith 匹配一个具体的值
        switch (grade){
            //case穿透现象  如果不加break，就会一直往下把所有东西都输出来
            case'a':
                System.out.println("优秀");
                break;
            case'b':
                System.out.println("良好");
                break;
            case'c':
                System.out.println("及格");
                break;
            case'd':
                System.out.println("再接再厉");
                break;
            case'e':
                System.out.println("挂科");
                break;
            default:
                System.out.println("未知等级");
        }


    }
}
