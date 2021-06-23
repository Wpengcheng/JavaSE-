package com.work;
//用同步代码块处理继承Thread类的安全问题
public class work4 {
    public static void main(String[] args) {

        BuyTicket2 ticket2 = new BuyTicket2();
        BuyTicket2 ticket3 = new BuyTicket2();
        BuyTicket2 ticket4 = new BuyTicket2();

        ticket2.setName("线程一");
        ticket3.setName("线程二");
        ticket4.setName("线程三");

        ticket2.start();
        ticket3.start();
        ticket4.start();
    }
}
class BuyTicket2 extends Thread{
    private static int tickets = 100;
//因为上面创建了三个对象，所以要让三个线程共享着一个锁obj，就要加static
  private  static Object  obj = new Object();
    @Override
    public void run() {
        while (true) {
            synchronized(obj) {
                //也可以拿BuyTicket2.class)充当锁
                //synchronized(BuyTicket2.class){
                if (tickets > 0) {

                    System.out.println(Thread.currentThread().getName() + "卖了第" + tickets + "张票");
                    tickets--;
                } else {
                    break;
                }
                // }
            }

        }
    }
}