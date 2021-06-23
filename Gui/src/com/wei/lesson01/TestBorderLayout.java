package com.wei.lesson01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//设置东西南北中布局
//布局是可以嵌套使用的，比如东西南北中布局中可以嵌套使用流式布局
public class TestBorderLayout {
    public static void main(String[] args) {
        Frame frame = new Frame("TestBorderLayout东西南北中窗口");

        //设置东西南北中布局
        //定义按钮
        Button east = new Button("East按钮");
        Button west = new Button("West按钮");
        Button south = new Button("South按钮");
        Button north = new Button("North按钮");
        Button center = new Button("Center按钮");

       //设置按钮在窗口的位置
        frame.add(east,BorderLayout.EAST);
        frame.add(west,BorderLayout.WEST);
        frame.add(south,BorderLayout.SOUTH);
        frame.add(north,BorderLayout.NORTH);
        frame.add(center,BorderLayout.CENTER);

        frame.setBounds(300,300,600,600);
        frame.setVisible(true);
        frame.setBackground(new Color(1,1,1));

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
