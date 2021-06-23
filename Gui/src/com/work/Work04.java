package com.work;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Work04 {
    public static void main(String[] args) {
    new Calculator().multiplication();
    }
    //写一个简易乘法计算器
}
class Calculator extends Frame{
    //属性
    TextField num1;
    TextField num2;
    TextField num3;
    //方法   乘法
    public void multiplication(){
        //组件 3个文本框，一个按钮，一个标识符
        num1 = new TextField(10);
        num2 = new TextField(10);
        num3 = new TextField(20);
        //按钮
        Button button = new Button("=");
        //按钮监听事件
        button.addActionListener(new MyCalculatorListene(this));
        //标识符
        Label label = new Label("*");
        //布局 流式布局
        setLayout(new FlowLayout());
        add(num1);
        add(label);
        add(num2);
        add(button);
        add( num3);
        setVisible(true);
        pack();

   //监听器类
   class MyCalculatorListene implements ActionListener{
       Calaulator calaulator = null;

       //构造器获得值
       public MyCalculatorListene(Calaulator calaulator) {
           this.calaulator = calaulator;
       }

       @Override
       public void actionPerformed(ActionEvent e) {
           //监听器要做的事情
           //获取乘数和被乘数，可以通过构造器来获取
           Calaulator calaulator = null;
           //把数转为int类型
         int n1= Integer.parseInt( calaulator.num1.getText());
         int n2= Integer.parseInt( calaulator.num2.getText());
         //将两个数运算后放入第三个框
           calaulator.num3.setText(""+(n1*n2));//int类型自动转为String类型
           //清除前2个框
           calaulator.num1.setText("");
           calaulator.num2.setText("");










       }
   }





    }


}
