package com.wei.lesson12;

import javax.swing.*;
import java.awt.*;

public class TestComboboxDemo01 extends JFrame {
    public TestComboboxDemo01(){
        Container container = this.getContentPane();

        JComboBox status = new JComboBox();

        status.addItem(null);
        status.addItem("对抗路");
        status.addItem("打野");
        status.addItem("中路");
        status.addItem("发育路");
        status.addItem("辅助");

        container.add(status);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(500,350);

    }

    public static void main(String[] args) {
        new TestComboboxDemo01();

    }
}
