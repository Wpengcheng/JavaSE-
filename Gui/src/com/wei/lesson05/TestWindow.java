package com.wei.lesson05;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//窗口监听
public class TestWindow {
    public static void main(String[] args) {
    new WindowFrame();

    }
}
class WindowFrame extends Frame{
    public WindowFrame() {
        setVisible(true);
        setBackground(Color.green);
        setBounds(100,200,200,300);
        this.addWindowListener(
               //匿名内部类   WindowAdapter是个抽象类，也是WindowListener的实现类
                new WindowAdapter(){
                    @Override//窗口关闭
                    public void windowClosing(WindowEvent e) {
                        System.out.println("windowClosing");
                        System.exit(0);
                    }

                    @Override//窗口已激活
                    public void windowActivated(WindowEvent e) {
                        WindowFrame source = (WindowFrame)e.getSource();//获取资源
                        System.out.println("windowActivated");
                        source.setTitle("被激活了");
                    }
                }
        );

    }
/*
    //监听器          继承WindowListener的实现类，就不用重写WindowListener那么多的方法了
class MyWindowListene extends WindowAdapter{
    @Override
    public void windowClosing(WindowEvent e) {
       setVisible(false);//隐藏窗口  最小化
       System.exit(0);//正常退出  0  非正常退出  1
    }


    }
*/
}