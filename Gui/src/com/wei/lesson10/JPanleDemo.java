package com.wei.lesson10;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPanleDemo extends JFrame {
    public JPanleDemo(){
        Container container = getContentPane();
        //表格布局                                           每个面板之间的上下间距
        container.setLayout(new GridLayout(2,2,10,10));

        JPanel panel1 = new JPanel(new GridLayout(1,2));
        JPanel panel2 = new JPanel(new GridLayout(2,1));
        JPanel panel3 = new JPanel(new GridLayout(1,3));
        JPanel panel4 = new JPanel(new GridLayout(3,1));


        panel1.add(new Button("1"));
        panel1.add(new Button("1"));
        panel2.add(new Button("2"));
        panel2.add(new Button("2"));
        panel3.add(new Button("3"));
        panel3.add(new Button("3"));
        panel3.add(new Button("3"));
        panel4.add(new Button("4"));
        panel4.add(new Button("4"));
        panel4.add(new Button("4"));

        container.add(panel1);
        container.add(panel2);
        container.add(panel3);
        container.add(panel4);

        this.setVisible(true);
        this.setSize(600,600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }

    public static void main(String[] args){
        new JPanleDemo();


    }
}
