package com.peng.cny;
//买火车票的案例
public class UnsafeBbuyticket {
    public static void main(String[] args) throws InterruptedException {
        BuyTicket buyTicket = new BuyTicket();

        new Thread(buyTicket,"车站").start();
        new Thread(buyTicket,"高铁").start();
        new Thread(buyTicket,"飞机").start();

        Thread.sleep(100);
    }
}
class BuyTicket implements Runnable{


    private int ticketNums=100;
    boolean flag = true;//线程的外部停止方式
    @Override
    public void run() {
        while (flag==true){

                buy();//调用买票的方法


        }
    }
    //synchronized同步方法，锁的是this，是本身的类的对象
private synchronized void buy() {
    if (ticketNums <= 0) {
        flag = false;
        return;
    }
    System.out.println(Thread.currentThread().getName() + "拿到了第" + ticketNums-- + "张票");
    }
}