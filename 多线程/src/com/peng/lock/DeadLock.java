package com.peng.lock;

//死锁：多个线程互相拿着对方需要的资源，然后形成僵持
public class DeadLock {
    public static void main(String[] args) {
        Makeup g1 = new Makeup(0,"白雪公主");
        Makeup g2 = new Makeup(1,"灰胡娘");

        g1.start();
        g2.start();

    }
}

//口红
class Lipstick{

}
//镜子
class Mirror{

}
//化妆的类
class Makeup extends Thread{

    //化妆需要的资源就只有一份，因此用static来保证只有一份
    static Lipstick lipstick = new Lipstick();
    static Mirror mirror = new Mirror();

    int choice;//选择
    String girlName;//化妆的人名字
    //构造器
    public Makeup(int choice,String girlName){
        this.choice=choice;
        this.girlName=girlName;
    }
    @Override
    public void run() {
        try {
            makeup();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }//化妆的方法
    private void makeup() throws InterruptedException {
        if (choice==0){
            //第一个人
            synchronized (lipstick){//获得口红对象的锁
                System.out.println(this.girlName+"获得口红的锁");
                Thread.sleep(1000);
                //两个同步块在一起,
                synchronized (mirror){//一秒后还想获得镜子的锁
                    System.out.println(this.girlName+"获得镜子的锁");
            }
            }
            }else {
            //第二个人
            synchronized (mirror){//获得镜子对象的锁
                System.out.println(this.girlName+"获得口红的锁");
                Thread.sleep(2000);

                synchronized (lipstick){//2秒后还想获得口红的锁
                    System.out.println(this.girlName+"获得镜子的锁");
                }
            }

        }
    }



}