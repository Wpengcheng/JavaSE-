package com.greedysnake;

import javax.swing.*;

//游戏的开始界面,主启动类
public class StartGame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("贪吃蛇小游戏");
        frame.setBounds(10,10,900,720);
        //设置窗口大小不可变
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //把面板放到窗口上
        frame.add(new GamePanel());
    }
}
