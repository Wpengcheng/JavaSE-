package com.peng.demon06;

//测试：用管程法解决生产者消费者问题，利用缓冲区

//需要的对象：生产者，消费者，产品，缓冲区
public class TestPC {
    public static void main(String[] args) {
        SynContainer container = new SynContainer();

        /*创建线程
        Productor productor = new Productor(container);
        Consumer consumer = new Consumer( new Consumer);
        开启线程
        productor.start();
        consumer.start();
        可以简化为下面两行代码
        */
        new Productor(container).start();
        new Consumer(container).start();

    }
}
//生产者
class Productor extends Thread{
    SynContainer container;
    //用构造器创建容器的对象
    public Productor(SynContainer container){
        this.container=container;
    }

    //生产的方法
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {

            container.push(new Chicken(i));//把鸡放进容器
            System.out.println("生产了"+i+"只鸡");

        }
    }
}
//消费者
class Consumer extends Thread{
    SynContainer container;
    //用构造器创建容器的对象
    public Consumer(SynContainer container){
        this.container=container;
    }

    //消费的方法

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("消费了-->"+container.pop().id+"只鸡");

        }
    }
}
//产品
class Chicken{

    int id;//定义产品的编号

    public Chicken(int id) {
        this.id = id;
    }
}
//缓冲区（容器）
class SynContainer{

    //容器的大小，可以放10个产品
    Chicken[] chickens = new Chicken[10];

    //计算容器里产品的数量
    int count = 0;

    //生产者放入产品
    //synchronized同步方法，让线程同步
    public synchronized void push(Chicken chicken){

        //如果容器满了,就需要消费者消费，然后生产者等待
        while (count == 10){
            //生产者等待
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        //如果没有满，生产者丢入产品
        chickens[count]=chicken;//把chicken丢进chickens数组的计数器里
        count++;

        //放完通知消费者来消费
        this.notifyAll();

    }
    //消费者消费产品
    public synchronized Chicken pop(){
        //判断能否消费
       while (count==0){ //如果容器为空，
            //等待生产者生产产品，消费者等待
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //如果可以消费
        count--;
        Chicken chicken = chickens[count];//把chickens数组的计数器里的产品取出来

        //消费完了，通知生产者生产，再放到缓冲区
        this.notifyAll();
        return chicken;

    }
}