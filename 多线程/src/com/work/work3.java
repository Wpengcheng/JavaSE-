package com.work;
//synchronized同步块测试
public class work3 {
    public static void main(String[] args) {
        BuyTicket1 buyTicket1 = new BuyTicket1();
        new Thread(buyTicket1,"窗口一").start();
        new Thread(buyTicket1,"窗口二").start();


    }



}
class BuyTicket1 implements Runnable{
 private int  tickets= 10;
  Object obj = new Object();


    @Override
    public  void run() {
        while (true){
           synchronized(obj){
                if (tickets>0){
                    tickets--;
                    System.out.println(Thread.currentThread().getName()+"卖了第"+tickets+"张票");
                }else {
                    break;
                }

         }

        }
    }
}