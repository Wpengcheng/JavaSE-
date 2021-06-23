package com.work;

public class work2 {
    public static void main(String[] args) {
        Window window1= new Window();
        Window window2 = new Window();
        Window window3= new Window();

        window1.setName("线程1");
        window2.setName("线程2");
        window3.setName("线程3");
        window1.start();
        window2.start();
        window3.start();
    }


}
class Window extends Thread{
    private static int ticket=10;

    @Override//同步方法
    public synchronized void run() {
        while (true){
            if (ticket>0){
                System.out.println(Thread.currentThread().getName()+"第"+ticket+"张票");
            ticket--;
            }else {

                break;
            }


        }
    }
}

