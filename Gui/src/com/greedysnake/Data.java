package com.greedysnake;

import javax.swing.*;
import java.net.URL;

//数据中心
public class Data {

    //在当前目录下获得图片的网址       headerURL存放了 header.png图片地址
    public static URL headerURL = Data.class.getResource("statics/header.png");
    //建一个ImageIcon的图片标签，然后返回一个ImageIcon类型名为header的图片
    public static ImageIcon header = new ImageIcon(headerURL);

    public static URL upURL = Data.class.getResource("statics/up.png");
    public static ImageIcon up = new ImageIcon(upURL);

    public static URL rightURL = Data.class.getResource("statics/right.png");
    public static ImageIcon right = new ImageIcon(rightURL);

    public static URL leftURL = Data.class.getResource("statics/left.png");
    public static ImageIcon left = new ImageIcon(leftURL);

    public static URL downURL = Data.class.getResource("statics/down.png");
    public static ImageIcon down = new ImageIcon(downURL);

    public static URL foodURL = Data.class.getResource("statics/food.png");
    public static ImageIcon food = new ImageIcon(foodURL);

    public static URL bodyURL = Data.class.getResource("statics/body.png");
    public static ImageIcon body = new ImageIcon(bodyURL);
}
