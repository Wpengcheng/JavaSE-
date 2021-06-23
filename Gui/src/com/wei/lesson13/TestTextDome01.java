package com.wei.lesson13;

import com.wei.lesson12.TestComboboxDemo02;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class TestTextDome01 extends JFrame {
    public TestTextDome01(){
        Container container = this.getContentPane();

        JTextField textField = new JTextField("hello");
        JTextField textField1 = new JTextField("world");

        container.add(textField,BorderLayout.NORTH);
        container.add(textField1,BorderLayout.SOUTH);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(500,350);

    }

    public static void main(String[] args) {
        new TestTextDome01();

    }
}

