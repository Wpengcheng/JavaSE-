package com.work;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//写一个简易计算器
public class Work02 {
    public static void main(String[] args) {
        //调用非静态方法
        new Calaulator().loadFrame();
    }
}
//建一个计算器类     外部类
class Calaulator extends Frame {
    //属性
    TextField num1;
    TextField num2;
    TextField num3;
    //方法
    public void loadFrame() {
        //计算器的组件：3个文本框，一个按钮，一个标签（+号）
        //3个文本框，这里的num都是String类型
        num1 = new TextField(10);//最大字符数
        num2 = new TextField(10);
        num3 = new TextField(20);
        //一个按钮
        Button button = new Button("=");
        //按钮监听事件，
        button.addActionListener(new MyCalaulatorListener());
        //一个标签（+号）
        Label label = new Label("+");
        //将3个组件流式布局,从左到右
        setLayout(new FlowLayout());
        add(num1);
        add(label);
        add(num2);
        add(button);
        add(num3);
        pack();
        setVisible(true);
    }
    //监听器类   也是一个内部类   内部类的好处就是可以畅通无阻的访问外部类的方法和属性
    //           实现类                实现              接口
    private class MyCalaulatorListener implements ActionListener {
        //监听器
        @Override//重写接口里的方法
        public void actionPerformed(ActionEvent e) {
            //按钮监听事件要做的事情
            //1.获得加数和被加数
            int n1 = Integer.parseInt(num1.getText());//用Integer.parseInt把String类型转为int类型
            int n2 = Integer.parseInt(num2.getText());
            //2.将2个数进行加法运算后放到第3个框
            num3.setText("" + (n1 + n2));//int类型自动转为String类型
            //3.清除前2个框
            num1.setText("");
            num2.setText("");
        }
    }
}


