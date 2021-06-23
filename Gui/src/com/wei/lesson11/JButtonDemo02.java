package com.wei.lesson11;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class JButtonDemo02 extends JFrame {
    public JButtonDemo02() {
        Container container =this. getContentPane();
        URL resource = JButtonDemo01.class.getResource("tx.jpg");
        Icon icon = new ImageIcon(resource);

        //单选框
        JRadioButton radioButton01 = new JRadioButton("JRadioButton01");
        JRadioButton radioButton02 = new JRadioButton("JRadioButton02");
        JRadioButton radioButton03 = new JRadioButton("JRadioButton03");

        //单选框只能选一个，因此把单选框按钮分进一个组，这个组只能选一个，就是单选框
        ButtonGroup group = new ButtonGroup();
        //把按钮放进组，一个组只能选一个
        group.add(radioButton01);
        group.add(radioButton02);
        group.add(radioButton03);

        container.add(radioButton01,BorderLayout.CENTER);
        container.add(radioButton02,BorderLayout.NORTH);
        container.add(radioButton03,BorderLayout.SOUTH);


        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new JButtonDemo02();
    }
}


