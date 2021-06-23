package com.peng.demon06;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

//测试线程池
public class TestPool {
    public static void main(String[] args) {
        //ExecutorService线程池接口    Executors：工具类，用于创建并返回不同类型的线程池

        //创建指定线程数量线程池
        ExecutorService service = Executors.newFixedThreadPool(10);
         //上面返回的对象service不是接口的对象，因为接口没有对象，返回的是接口的实现类的对象

        //把service进行类型强制转换
        ThreadPoolExecutor service1 = (ThreadPoolExecutor)service;

        //设置线程池的属性  因为ExecutorService是线程池接口，里面的属性为常量，所以如果要设置属性就要在接口的实现类中设置
        System.out.println(service.getClass());//获取service对象是哪个类造的    ThreadPoolExecutor

        service1.setCorePoolSize(16);//设置核心池的大小
        service1.setMaximumPoolSize(20);//设置最大线程数

        //把线程放入创建的执行服务里
        //执行指定的线程操作，需要提供实现Runnable接口或Callable接口的实现类对象
        service.execute(new MyThread());//线程1输出偶数
        //execute方法：执行任务/命令，没有返回值，一般用来执行Runnable
        service.execute(new MyThread1());//线程2输出奇数
        service.execute(new MyThread1());//线程3输出奇数

        //关闭连接
        service.shutdown();

    }
}
class MyThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }

    }
}
class MyThread1 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <= 20; i++) {
            if (i % 2 != 0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }

    }
}
