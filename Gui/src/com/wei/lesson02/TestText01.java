package com.wei.lesson02;
import java.awt.*;
import java.awt.event.*;
public class TestText01 {
    public static void main(String[] args) {
        //正常的main方法里面应该只有一行启动代码
    new MyFrame();
    }
}//文本框监听事件
class MyFrame extends Frame {
    public MyFrame() {
        TextField textField = new TextField();
        add(textField);
        MyActionListener2 myActionListener2 = new MyActionListener2();
        //监听文本框输入的文字，按下enter就会触发输入框事件
        textField.addActionListener(myActionListener2);
        //设置替换编码
        textField.setEchoChar('*');
        pack();
        setVisible(true);
    }
    }//监听器类
    class MyActionListener2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            //getSource强转成TextField类，就可以拿到TextField里的资源
            TextField field = (TextField) e.getSource();
            //获得输入框的文本
            System.out.println(field.getText());
            //回车一次就清空输入框里的文本一次
            field.setText("");
        }
    }
