package com.wei.lesson02;

import java.awt.*;
import java.awt.event.*;

public class TestAction2 {
    public static void main(String[] args) {
        //多个按钮实现同一个监听事件
        //如果按下start按钮实现一个操作，按下stop按钮实现另一个操作

        Frame frame = new Frame();

        Button button1 = new Button("start");
       Button button2= new Button("stop");
       Button button3= new Button("sleep");

       frame.add(button1,BorderLayout.EAST);
       frame.add(button2,BorderLayout.WEST);
       frame.add(button3,BorderLayout.CENTER);

        //给按钮设置一下信息,下面通过e可以拿到
        //如果没设置信息，则默认的输出按钮上的lable
        button1.setActionCommand("button1-start");
        button2.setActionCommand("button2-stop");
        button3.setActionCommand("啥也不干");

        MyMonitor myMonitor = new MyMonitor();

        button1.addActionListener(myMonitor);
        button2.addActionListener(myMonitor);
        button3.addActionListener(myMonitor);

        frame.setVisible(true);
        frame.pack();
        windowClose(frame);

    }
private static void windowClose(Frame frame){

    frame.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    });
}
}//监听类
class MyMonitor implements ActionListener{
    @Override//实现了接口就要重写里面的方法
    public void actionPerformed(ActionEvent e) {
        //e.getActionCommand()获得按钮的信息
        System.out.println( "按钮被点击了: msg=> "+e.getActionCommand());




    }
}