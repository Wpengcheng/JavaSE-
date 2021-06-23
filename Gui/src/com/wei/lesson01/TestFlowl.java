package com.wei.lesson01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//设置流式布局
public class TestFlowl {
    public static void main(String[] args) {
        Frame frame = new Frame("TestFlowl流式布局窗口");

        //组件——按钮
        Button button1 = new Button("Button1");
        Button button2 = new Button("Button2");
        Button button3 = new Button("Button3");
       //设置流式布局
        frame.setLayout(new FlowLayout());//默认位置居中
        //frame.setLayout(new FlowLayout(FlowLayout.LEFT));  左
        //frame.setLayout(new FlowLayout(FlowLayout.RIGHT)); 右


        frame.setBounds(300,300,600,600);
        frame.setBackground(new Color(11,34,56));
        frame.setVisible(true);
        //把按钮添加上去
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);




        //监听事件，监听窗口关闭事件   System.exit(0)强制结束
        //适配器模式
        frame.addWindowListener(new WindowAdapter() {
            //点击窗口关闭要做的事情
            @Override
            public void windowClosing(WindowEvent e) {
                //结束程序
                System.exit(0);
            }
        });
    }
}
