package com.wei.lesson08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//主窗口
public class DialogDemo extends JFrame {
    public DialogDemo(){//在构造器里调用自己类的方法用this
        this.setVisible(true);
        this.setSize(700,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //JFrame需要一个容器存放东西   获得一个内容窗格然后返回一个容器里面
        Container container = this.getContentPane();
        //绝对布局  自己定义布局内容，不可改变
        container.setLayout(null);
        //按钮
        JButton button = new JButton("点我弹出");
        button.setBounds(30,30,200,50);
        //点击这个按钮弹出一个弹窗
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MyDialogDemo();
            }
        });
        container.add(button);
    }
    public static void main(String[] args) {
        new DialogDemo();
    }
}
//弹窗的窗口1
class MyDialogDemo extends JDialog{
    public MyDialogDemo() {
        this.setVisible(true);
        this.setBounds(100,100,500,500);
        Container container = this.getContentPane();
        container.setLayout(null);
        container.add(new Label("0基础学java，从入门到入土"));
    }
};




