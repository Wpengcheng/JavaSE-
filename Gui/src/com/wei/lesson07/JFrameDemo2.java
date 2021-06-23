package com.wei.lesson07;

import javax.swing.*;
import java.awt.*;
public class JFrameDemo2 {
    public static void main(String[] args) {
        new MyJFrame2().init();
    }
}
class MyJFrame2 extends JFrame {
    public void init(){
        MyJFrame2 myJFrame2 = new MyJFrame2();
        //给窗口设置文字
        JLabel jLabel = new JLabel("设置在窗口里面的文字");
        this.add(jLabel);//把jLabel加到MyJFrame2上面
        //让文本标签在窗口居中
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);
        //获得一个容器
        Container container = this.getContentPane();
        //容器里的颜色才是窗口的颜色
        container.setBackground(Color.green);
        this.setVisible(true);
        this.setBounds(10,10,200,200);
        //关闭事件
       new MyJFrame2().setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}