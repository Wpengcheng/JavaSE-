package com.peng.demon01;


import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

//实现多线程同步下载图片
public class TestThread02 implements Runnable{
   private String url;//地址
   private String name;//图片名
    // 构造器
    public TestThread02(String url, String name) {
        this.url = url;
        this.name = name;
    }
    @Override
    public void run() {
        //线程执行体
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downloader(url,name);
        System.out.println("下载了文件名为"+name);
    }

    public static void main(String[] args) {
        //线程体
        //创建线程对象
        TestThread02 testThread01 = new TestThread02("http://www.xinhuanet.com/photo/2020-08/26/1126412315_15983723897731n.jpg",",新华网图片1.jpg");
        TestThread02 testThread02 = new TestThread02("http://www.xinhuanet.com/photo/2020-08/26/1126412315_15983723898911n.jpg",",新华网图片2.jpg");
        TestThread02 testThread03 = new TestThread02("http://www.xinhuanet.com/photo/2020-08/25/1126412104_15983627450851n.jpg",",新华网图片3.jpg");
        TestThread02 testThread04 = new TestThread02("http://www.xinhuanet.com/photo/2020-08/25/1126412104_15983627451171n.jpg",",新华网图片4.jpg");

        //启动线程
        new Thread(testThread01).start();
        new Thread(testThread02).start();
        new Thread(testThread03).start();
        new Thread(testThread04).start();
}
//下载器
class WebDownloader {
    //下载方法
    public void downloader(String url, String name) {
        try {//捕获异常
            // FileUtils是一个工具类，copyURLToFile是一个方法，方法的作用是把网络资源的地址变成文件
            FileUtils.copyURLToFile(new URL(url), new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常,downloader方法出现问题");
        }
    }
    }
    }