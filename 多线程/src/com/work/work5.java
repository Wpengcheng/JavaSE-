package com.work;
//用synchronized同步方法解决继承Thread类的线程不安全问题
public class work5 {
    public static void main(String[] args) {
        Window4 window4 = new Window4();
        Window4 window1 = new Window4();
        Window4 window2 = new Window4();

        window1.start();
        window2.start();
        window4.start();
    }
}
class Window4 extends Thread{
   private static int tickets = 100;

    @Override
    public void run() {

        while (true) {
            buy();
        }
    }
    //在这里不能直接用synchronized同步方法，因为这里锁的对象由三个window4 window1 window2，不是this
    //变成静态方法后，这时候的锁（同步监视器）就是唯一的，是Window4.class这个类   (在静态方法里面不能调this)
    private static synchronized  void buy(){
        if (tickets>0){
            System.out.println(Thread.currentThread().getName()+" "+tickets);
        tickets--;
        }
    }
}