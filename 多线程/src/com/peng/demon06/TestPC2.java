package com.peng.demon06;
//测试信号灯法——通过标志位
public class TestPC2 {
    public static void main(String[] args) {
        TV tv = new TV();
        new Player(tv).start();
        new Watcher(tv).start();
    }
}
//生产者-->演员
class Player extends Thread{
    TV tv = new TV();
    public Player(TV tv){
        this.tv = tv;
    }
        @Override
        public void run() {
            for (int i = 0; i < 20; i++) {
                if (i%2==0){
                    tv.play("中餐厅");
                }else {
                    tv.play("广告");
                }

            }
        }
}

//消费者-->观众
class Watcher extends Thread {
    TV tv = new TV();
    public Watcher(TV tv) {
       this.tv = tv;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            tv.watch();
        }
    }
}

//产品-->节目（不需要缓冲区了）
class TV{
    //演员表演，观众等待    true
    //观众观看，演员等待    false
    String voice;//表演的节目
    boolean flag = true;//标志位

    //表演
    public synchronized void play(String voice) {
        while (flag == false) {//如果标志位为false
            try {
                this.wait();//让演员等待
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            //通知观众观看
            this.notifyAll();//唤醒观众
            this.voice = voice;
            System.out.println("演员表演了" + voice);
            this.flag = !this.flag;//取反
        }

    //观看
    public synchronized void watch(){
        while (flag==true) {//如果标志位为true
            try {
                this.wait();//让观众等待
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

            //通知演员表演，唤醒等待
            this.notifyAll();
            System.out.println("观众观看了：" + voice);
            this.flag = !this.flag;//取反

        }
}