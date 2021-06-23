package com.wei.lesson01;

import java.awt.*;

public class TestFrame2 {
    public static void main(String[] args) {
        //展示多个窗口
        MyFrame myFrame1 = new MyFrame(100,100,400,400,Color.blue);
        MyFrame myFrame2 = new MyFrame(500,100,400,400,Color.yellow);
        MyFrame myFrame3 = new MyFrame(100,500,400,400,Color.red);
        MyFrame myFrame4 = new MyFrame(500,500,400,400,Color.green);

    }
}//写一个类继承Frame类，就可以实现Frame里的所有方法
class MyFrame extends Frame{
    static int id = 0;//可能存在多个窗口，所以需要一个计数器,给窗口计数
    public MyFrame(int x,int y,int w,int h,Color color){
        super("MyFrame"+(++id));
        //设置背景颜色
        setBackground( color);
        //设置窗口位置，设置窗口大小
        setBounds(x,y,w,h);
        //设置可见性
        setVisible(true);


    }
}