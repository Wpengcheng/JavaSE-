package com.wei.lesson09;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

 class ImageIconDemo extends JFrame {
    public ImageIconDemo(){
        setBounds(100,100,800,800);
        JLabel label = new JLabel("万茜");
        //获取图片的地址  url具体的地址
        URL url = ImageIconDemo.class.getResource("头像.jpg");//通过这个类获得类目录下的资源
        //ImageIcon是Icon的一个实现类
        ImageIcon imageIcon = new ImageIcon(url);//新建一个图片标签，里面有图片的地址，然后在返回一个imageIcon用于存放照片
        label.setIcon(imageIcon);
        //居中显示
        label.setHorizontalAlignment(SwingConstants.CENTER);

        Container container = getContentPane();
        container.add(label);

        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }


    public static void main(String[] args) {
        new ImageIconDemo();

    }
}
