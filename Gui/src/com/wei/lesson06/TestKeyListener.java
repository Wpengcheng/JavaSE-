package com.wei.lesson06;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TestKeyListener {
    public static void main(String[] args) {
        new keyFrame();
    }
}
class keyFrame extends Frame{
    public keyFrame(){
        setBounds(1,2,200,200);
        setVisible(true);
        //在keyFrame类里面添加一个键盘监听器
        this.addKeyListener(new KeyAdapter() {
            //键盘按下不同的键，出现不同的结果
            @Override
            public void keyPressed(KeyEvent e) {
               //识别键盘按下的是哪一个键，每个键有自己的键码
                int keyCode = e.getKeyCode();//获得当前键盘的键码，并返回到keyCode里面
                System.out.println(keyCode);//输出键码
                if (keyCode == KeyEvent.VK_UP){
                    System.out.println("你按下了上键");
                }
                    }
        });
    }
}