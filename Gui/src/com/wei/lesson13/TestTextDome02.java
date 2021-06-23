package com.wei.lesson13;

import javax.swing.*;
import java.awt.*;

public class TestTextDome02 extends JFrame {
    public TestTextDome02(){
        Container container = this.getContentPane();

        JPasswordField passwordField = new JPasswordField();
        passwordField.setEchoChar('*');

        container.add(passwordField);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(500,350);

    }

    public static void main(String[] args) {
        new TestTextDome02();
    }
}

