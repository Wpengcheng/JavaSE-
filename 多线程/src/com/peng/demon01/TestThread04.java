package com.peng.demon01;

//多个线程同时操作同一个对象    买火车票的例子
public class TestThread04 implements Runnable{
    //票数
    private int ticketNums = 10;
    @Override
    public void run() {
        while (true){//如果买到了票
            if (ticketNums<=0){
                break;//如果没票了就退出
            }                 //通过这个方法获得当前执行线程的名字
            System.out.println(Thread.currentThread().getName()+"-->拿到了第"+ticketNums--+"张票");
        }
    }
    public static void main(String[] args) {
        //创建Runnable实现类的对象
        TestThread04 ticket = new TestThread04();
        //开启多个线程
        new Thread(ticket,"狂铁").start();
        new Thread(ticket,"后羿").start();
        new Thread(ticket,"达摩").start();
    }
}
