package com.wei.lesson09;

import javax.swing.*;
import java.awt.*;

//Icon 图标是一个接口，要一个实现类
public class IconDemo extends JFrame implements Icon{
    private int width;
    private int height;
    public IconDemo(){}//无参构造

    public IconDemo(int width,int height) {
        this.width=width;
        this.height=height;
    }
     public void init(){
        IconDemo iconDemo = new IconDemo(15, 15);//返回一个图标iconDemo
        //图标放在标签上                    标签名字   标签要加的图标    让图标位于标签的中间
        JLabel label = new JLabel("这是一个标签", iconDemo, SwingConstants.CENTER);
        Container container = getContentPane();
        container.add(label);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(100,100,500,500);
        }
    public static void main(String[] args) {
        new IconDemo().init();
    }
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.fillRect(x,y,width,height);
    }
    @Override
    public int getIconWidth() {
        return this. width;
    }
    @Override
    public int getIconHeight() {
        return this.height;
    }
}
