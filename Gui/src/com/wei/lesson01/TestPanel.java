package com.wei.lesson01;



import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

// Panel面板，可以看成一个空间，但不能单独存在，要放在Frame上面
public class TestPanel {
    public static void main(String[] args) {
        Frame frame = new Frame();//总的窗口
        //面板里面存在一个布局的概念
        Panel panel = new Panel();//面板
        Panel panel1 = new Panel();
        Panel panel2 = new Panel();
        Panel panel3 = new Panel();
        //设置布局,如果不设置则默认会置顶
        frame.setLayout(null);
        //设置窗口坐标
        frame.setBounds(300,300,800,800);
        //设置窗口颜色
        frame.setBackground(new Color(1, 253, 35));
        //设置面板坐标,相对于frame
        panel.setBounds(150,150,200,200);
        panel1.setBounds(350,150,200,200);
        panel2.setBounds(150,350,200,200);
        panel3.setBounds(350,350,200,200);
        //设置面板颜色
        panel.setBackground(new  Color(253, 0, 2));
        panel1.setBackground(new  Color(1, 253, 224, 255));
        panel2.setBackground(new  Color(0, 72, 253));
        panel3.setBackground(new  Color(164, 0, 253));
       //frame里面添加一个panel，或者panel内嵌进frame里面去
        frame.add(panel);
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        //设置可见性
        frame.setVisible(true);
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

