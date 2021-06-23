package com.peng.demon02;

import com.peng.demon01.TestThread02;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.*;

//线程创建方式三：实现Callable接口
public class TestCallable implements Callable <Boolean>{
    private String url;//地址
    private String name;//图片名
    // 构造器
    public TestCallable(String url, String name) {
        this.url = url;
        this.name = name;
    }
    @Override
    public Boolean call() {
        //线程执行体
       WebDownloader webDownloader = new WebDownloader();
        webDownloader.downloader(url,name);
        System.out.println("下载了文件名为"+name);
        return true;
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //线程体
        //创建线程对象
        TestCallable testCallable01 = new TestCallable("http://www.xinhuanet.com/photo/2020-08/26/1126412315_15983723897731n.jpg",",新华网图片1.jpg");
        TestCallable testCallable02 = new TestCallable("http://www.xinhuanet.com/photo/2020-08/26/1126412315_15983723898911n.jpg",",新华网图片2.jpg");
        TestCallable testCallable03 = new TestCallable("http://www.xinhuanet.com/photo/2020-08/25/1126412104_15983627450851n.jpg",",新华网图片3.jpg");
        TestCallable testCallable04 = new TestCallable("http://www.xinhuanet.com/photo/2020-08/25/1126412104_15983627451171n.jpg",",新华网图片4.jpg");

        //启动线程
        //创建执行服务   ExecutorService,Executors是两个类    FixedThreadPool线程池
        ExecutorService ser = Executors.newFixedThreadPool(3);
        //提交执行 把三个线程提交上去，然后返回三个返回值，三个返回值都是true
        Future<Boolean> result1 = ser.submit(testCallable01);
        //submit方法：执行任务，有返回值，一般用来执行Callable接口
        Future<Boolean> result2 = ser.submit(testCallable02);
        Future<Boolean> result3 = ser.submit(testCallable03);

        //获取结果 获得返回值，返回值类型为boolean，返回值名字为r1,r2,r3
        boolean r1 = result1.get();
        boolean r2 = result1.get();
        boolean r3 = result1.get();

        System.out.println(r1);//true
        System.out.println(r2);//true
        System.out.println(r3);//true
        //关闭服务
        ser.shutdownNow();
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

