package com.wei.lesson10;

import javax.swing.*;
import java.awt.*;

public class JScrollDemo extends JFrame {
    public JScrollDemo(){
        Container container = getContentPane();

        //文本域，可以换行
        JTextArea textArea = new JTextArea(20, 50);
        textArea.setText("零基础学java，从入门到入土");
        //建一个ScrollPane滚动窗格，把textArea放进去
        JScrollPane scrollPane = new JScrollPane(textArea);

        //把ScrollPane滚动窗格放到容器里
        container.add(scrollPane);

        this.setBounds(100,100,500,800);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new JScrollDemo();
    }

}
