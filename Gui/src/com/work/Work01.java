package com.work;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Work01 {
    public static void main(String[] args) {
       //1.先设置一个总窗口
        Frame frame = new Frame("作业窗口");

        //2.通过表格布局把总窗口分成上下两个面板
        frame.setLayout(new GridLayout(2,1));

        //3.把上面版p1设置成东西南北中布局，
        Panel p1 = new Panel(new BorderLayout());

        //然后在上面版中间内嵌一个面板p2,通过表格布局把p2分成上下两个小面板
        Panel p2 = new Panel(new GridLayout(2,1));

        //4.把下面版p3也设置成东西南北中布局，
        Panel p3 = new Panel(new BorderLayout());

        //然后在下面版中间内嵌一个面板p4,通过表格布局把p2分成四个小面板
        Panel p4 = new Panel(new GridLayout(2,2));

        frame.setBounds(300,300,400,400);

       //在上面版p1左右两边各设置一个按钮，用东西南北中布局
        p1.add(new Button("East-1"),BorderLayout.EAST);
        p1.add(new Button("West-1"),BorderLayout.WEST);

        //在上中面版p2上下各设置一个按钮，用表格布局
        p2.add(new Button("btn1"));
        p2.add(new Button("btn2"));

        //在下面版p2左右两边各设置一个按钮，用东西南北中布局
        p3.add(new Button("East-2"),BorderLayout.EAST);
        p3.add(new Button("West-2"),BorderLayout.WEST);

        //在下中面版p4上下各设置一个按钮，用表格布局
        p4.add(new Button("btn-3"));
        p4.add(new Button("btn-4"));
        p4.add(new Button("btn-5"));
        p4.add(new Button("btn-6"));

       //也可以用for循环来设置四个按钮
       // for (int i = 0; i < 4; i++) {
           // p4.add(new Button("btn-"+i));
       // }

        //把p2,p4放进p1,p2中间区域
        p1.add(p2,BorderLayout.CENTER);
        p3.add(p4,BorderLayout.CENTER);

        frame.add(p1);
        frame.add(p3);

        frame.setVisible(true);

        //监听事件，监听窗口关闭事件   System.exit(0)强制结束
        //适配器模式
        frame.addWindowListener(new WindowAdapter() {
            //点击窗口关闭要做的事情
            @Override
            public void windowClosing(WindowEvent e) {
                //结束程序
                System.exit(0);
            }
        });
    }
}
