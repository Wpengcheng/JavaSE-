package com.wei.lesson01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//设置表格布局
public class TestGridLayout {
    public static void main(String[] args) {
        Frame frame = new Frame("TestGridLayout表格布局窗口");
        Button button1 = new Button("btn1");
        Button button2 = new Button("btn2");
        Button button3 = new Button("btn3");
        Button button4 = new Button("btn4");
        Button button5 = new Button("btn5");
        Button button6 = new Button("btn6");

        //设置一个三行两列的表格
        frame.setLayout(new GridLayout(3,2));

        //填充按钮，表格会自动填充
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);

        frame.setVisible(true);
        frame.pack();//java函数，会自动的选择最优秀的位置进行布局
        frame.setBackground(new Color(1,1,1));
        frame.setBounds(300,300,600,600);

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
