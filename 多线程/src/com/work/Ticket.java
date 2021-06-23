package com.work;
//锁LOCK的测试
import java.util.concurrent.locks.ReentrantLock;

public class Ticket {

    public static void main(String[] args) {
        BuyTicket buyTicket = new BuyTicket();

        new Thread(buyTicket).start();
        new Thread(buyTicket).start();
        new Thread(buyTicket).start();


    }
}
class BuyTicket implements Runnable{

   private int ticketNums = 15;

        private final ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {;

        try {
            lock.lock();
            if (ticketNums > 0) {

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(ticketNums--);
            } else {
                break;
            }

        } finally {
            lock.unlock();
        }

    }
        }

    }
