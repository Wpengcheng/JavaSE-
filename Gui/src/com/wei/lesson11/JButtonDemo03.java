package com.wei.lesson11;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class JButtonDemo03 extends JFrame {
    public JButtonDemo03() {
        Container container =this. getContentPane();
        URL resource = JButtonDemo01.class.getResource("tx.jpg");
        Icon icon = new ImageIcon(resource);

        //多选框
        JCheckBox checkBox1 = new JCheckBox("checkBox1");
        JCheckBox checkBox2 = new JCheckBox("checkBox2");
        JCheckBox checkBox3 = new JCheckBox("checkBox3");

        container.add(checkBox1,BorderLayout.SOUTH);
        container.add(checkBox2,BorderLayout.NORTH);
        container.add(checkBox3,BorderLayout.EAST);


        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new JButtonDemo03();
    }
}



