package com.wei.www.Scanner;


import java.util.Scanner;

public class Demon01 {
    public static void main(String[] args) {
        //创建一个扫描器对象，用于接收键盘输入
       Scanner  scanner=new Scanner(System.in );
        System.out.println("使用next方式接收");
        //判断用户有没有输入字符串
        if (scanner.hasNext()){
            //使用next方式接收
            String str = scanner.next();//程序会等待用户输入完毕，否则程序会一直停在这里
            System.out.println("输出端的内容为:"+str);
            //凡是属于IO（输入输出）流的类如果不关闭会一直占用资源，要要用完就关掉
            scanner.close();
        }
    }
}
