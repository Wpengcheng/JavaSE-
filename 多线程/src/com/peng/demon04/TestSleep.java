package com.peng.demon04;

import com.peng.demon01.TestThread04;

/*模拟网络延时
提高问题的发生性，让代码的问题可见
* */
public class TestSleep implements Runnable{
    //票数
    private int ticketNums = 10;
    @Override
    public void run() {
        while (true){//如果买到了票
            if (ticketNums<=0){
                break;//如果没票了就退出
            }
            //模拟延时
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //               通过这个方法获得当前执行线程的名字
            System.out.println(Thread.currentThread().getName()+"-->拿到了第"+ticketNums--+"张票");
        }
    }
    public static void main(String[] args) {
        //创建Runnable实现类的对象
        TestSleep ticket = new TestSleep();
        //开启多个线程
        new Thread(ticket,"狂铁").start();
        new Thread(ticket,"后羿").start();
        new Thread(ticket,"达摩").start();
    }
}
