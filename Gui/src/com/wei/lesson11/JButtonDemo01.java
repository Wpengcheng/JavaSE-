package com.wei.lesson11;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class JButtonDemo01 extends JFrame {
    public JButtonDemo01() {
        Container container =this. getContentPane();
        URL resource = JButtonDemo01.class.getResource("tx.jpg");

        Icon icon = new ImageIcon(resource);

        JButton button = new JButton();
        button.setIcon(icon);
        button.setToolTipText("图片按钮");

        container.add(button);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new JButtonDemo01();
    }
}
