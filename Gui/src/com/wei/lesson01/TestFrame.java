package com.wei.lesson01;

import java.awt.*;

//GUI的第一个界面
 public class TestFrame {
    public static void main(String[] args) {
        //Frame对象
        Frame  frame= new Frame("我的第一个java图像界面窗口");
        //这个窗口是看不见的，需要设置可见性才能看见
        frame.setVisible(true);
        //设置窗口大小
        frame.setSize(800,800);
        //设置背景颜色  Color类
        frame.setBackground(new Color(253, 152, 1));
        //设置窗口位置
        frame.setLocation(100,200);
        //设置界面的大小固定
        frame.setResizable(false);
    }
}
