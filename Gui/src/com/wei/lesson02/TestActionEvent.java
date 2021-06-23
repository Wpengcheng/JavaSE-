package com.wei.lesson02;

import java.awt.*;
import java.awt.event.*;

//一个按钮的事件监听
public class TestActionEvent {
    public static void main(String[] args) {

        Frame frame = new Frame();

        Button button = new Button("btn");

        MyActionListener myActionListener = new MyActionListener();

        //按钮监听事件
        button.addActionListener(myActionListener);

        frame.add(button, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
        windowClose(frame);

    }
    //关闭窗口的事件
    private static void windowClose(Frame frame) {
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
     class MyActionListener implements ActionListener {
        //监听事件，当某个事件发生时，将要干什么
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("aaa");//按下按钮时，将会输出这个指令

        }

    }










