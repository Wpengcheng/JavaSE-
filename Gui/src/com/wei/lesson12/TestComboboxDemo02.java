package com.wei.lesson12;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class TestComboboxDemo02 extends JFrame {
    public TestComboboxDemo02(){
        Container container = this.getContentPane();
        //生成静态的列表的内容   一个数组
        //String[] contents = {"1","2","3","4"};

       //生成动态可扩容的内容
        Vector contents = new Vector();

        //建一个列表，把内容放入列表
        JList jList = new JList(contents);

        contents.add("狂铁");
        contents.add("虞姬");
        contents.add("甄姬");
        contents.add("李白");

        container.add(jList);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(500,350);

    }

    public static void main(String[] args) {
        new TestComboboxDemo02();

    }
}
