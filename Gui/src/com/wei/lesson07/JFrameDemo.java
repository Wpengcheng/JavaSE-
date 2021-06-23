package com.wei.lesson07;

import javax.swing.*;
import java.awt.*;
public class JFrameDemo {
    public static void main(String[] args) {
        //建立一个窗口
        new MyJFrame().init();
    }
}//JFrame默认了关闭键
class MyJFrame extends JFrame{
    public void init(){
        setVisible(true);
        setBounds(100,100,200,200);
        //给窗口设置文字
        JLabel jLabel = new JLabel("设置的文字");
        add(jLabel);//把jLabel加到jframe上面
        //让文本标签在窗口居中
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);
        //获得一个容器
        Container container = this.getContentPane();
        //容器里的颜色才是窗口的颜色
        container.setBackground(Color.green);
    }
    }

