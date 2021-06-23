package 基础语法.src.com.cheng.www.HomeWork;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Work04 {
    public static void main(String[] args) {
        new Calaulator1().multiplication();
    }
}
 class Calaulator1 extends Frame{
    //属性
    TextField num1;
    TextField num2;
    TextField num3;
    //方法  乘法
    public void multiplication() {
        //组件   三个文本框，一个标识符，一个按钮
        //三个文本框
      num1 = new TextField("10");
        //按钮
        Button button = new Button("=");
        button.addActionListener(new MyCalaulatorListener(this));
        //标识符
        Label label = new Label("*");
        //流式布局
        setLayout(new FlowLayout());
        add(num1);
        add(label);
        add(num2);
        add(button);
        add(num3);
        pack();
        setVisible(true);
    }
}
    //监听器类
    class MyCalaulatorListener implements ActionListener {
        Calaulator1 calaulator = null;
        public MyCalaulatorListener(Calaulator1 calaulator) {
            this.calaulator = calaulator;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            //按钮监听事件要做的事情
            int n1 = Integer.parseInt(calaulator.num1.getText());
            int n2 = Integer.parseInt(calaulator.num2.getText());
            calaulator.num3.setText("" + (n1 * n2));
            calaulator.num1.setText("");
            calaulator.num2.setText("");
        }
    }












