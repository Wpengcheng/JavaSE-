package com.peng.demon04;
//测试守护线程
public class TestDaemon {
    public static void main(String[] args) {
        Gad gad = new Gad();

        You you = new You();

        //设置为守护线程
        Thread thread = new Thread(gad);//代理
        thread.setDaemon(true);//默认是false表示是用户线程

        thread.start();
        new Thread(you).start();
    }
}
//上帝    守护线程
class Gad implements Runnable{
    @Override
    public void run() {
        while (true){
            System.out.println("上帝一直在");
        }
    }
}
//你    用户线程   只要用户线程结束了，虚拟机就停止，但停止需要点时间，所以就还会运行一会守护线程
class You implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 30000; i++) {
            System.out.println("开心的活着");
        }
        System.out.println("goodbey world");
    }
}