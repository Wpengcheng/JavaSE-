package com.wei.lesson03;

import java.awt.*;

public class TestPaint {
    public static void main(String[] args) {
        new MyPaint().loadFrame();
    }
}
class MyPaint extends Frame{
    public void loadFrame(){
        setVisible(true);
        setBounds(200,200,600,600);
    }
    @Override//画笔监听事件
    public void paint(Graphics g) {
        //颜色
        g.setColor(Color.RED);
        g.drawOval(100,100,100,100);//空心圆
        g.drawRect(100,200,100,100);
        g.fillOval(200,100,100,100);//实心圆
        g.fillRect(200,200,100,100);
        //画笔用完将颜色还原








    }
}