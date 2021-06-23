package com.wei.lesson04;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

//鼠标监听事件
public class TestMouseListener {
    public static void main(String[] args) {
        new MyFrame("画图");
    }
}


class MyFrame extends Frame {
    ArrayList points;
    public MyFrame(String title) {
        super(title);//调用父类的属性
        setBounds(200, 200, 400, 400);
        //存鼠标点击的点  ArrayList：数组清单   用来存放点，再传给points
        points = new ArrayList<>();
        //建一个鼠标监听器，要针对画画的这个窗口
        //this代表当前的这个窗口
        this.addMouseListener(new MyMouseListener());//鼠标被监听上了
        setVisible(true);
    }


    @Override//画笔监听事件要和鼠标监听事件绑定
    public void paint(Graphics g) {
        //画下去的每一个位置都要和鼠标绑定
        Iterator iterator = points.iterator();//对points使用迭代器，遍历里面的点
        //如果迭代器里还存在点，就画下来，然后在对下一个点遍历
        while (iterator.hasNext()) {
            Point point = (Point) iterator.next();//返回一个Point类型的点
            g.setColor(Color.DARK_GRAY);
            //鼠标点击的点在窗口上可能显示的是一个圆
            g.drawOval(point.x, point.y, 10, 10);
        }
    }
    //把鼠标上点击的点添加到画笔上，就是鼠标和画笔绑定了
    public void addPaint(Point point) {//写一个方法调用用来存放鼠标的点的points
        points.add(point);//point表示当前传过来的点，把point存进points里
    }


    //适配器模式    监听器类
  private   class MyMouseListener extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {//e获取鼠标的资源
            e.getSource();//getSource的资源的来源是Frame窗口，
            MyFrame frame = (MyFrame) e.getSource();//把Frame类型强转为MyFrame类型，就获取了画图的窗口里的鼠标相关的资源
            //这个点就是鼠标的点   把当前的点传给上面的points进行遍历
            frame.addPaint(new Point(e.getX(), e.getY())) ;//坐标

           //每次点击鼠标都要重新画一遍，将之前画的点保存了下来  才能画多个点
            frame.repaint();//刷新页面
        }
    }
}

