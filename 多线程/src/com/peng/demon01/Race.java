package com.peng.demon01;
//模拟龟兔赛跑
public class Race implements Runnable {
    //定义一个胜利者
    private static String winner;
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {//赛道一百米
           //模拟兔子休息
            if (Thread.currentThread().getName().equals("兔子")&& i%10==0){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //判断比赛是否结束
            boolean flag = gameOver(i);
            if (flag==true){//如果比赛结束，就停止程序
                break;
            }
            //                  获得执行线程的名字
            System.out.println(Thread.currentThread().getName() + "-->跑了" + i + "步");
        }
    }
    //判断是否完成比赛
    private boolean gameOver(int steps) {
        if (winner != null) {//如果产生胜利者
            return true;//则 比赛结束
        }{
            if (steps>=100){
                winner=Thread.currentThread().getName();
                System.out.println("winner is"+winner);
                return true;
            }
        }
    return false;
    }
    public static void main(String[] args) {
        //开启线程
        Race race = new Race();
        new  Thread(race,"兔子").start();
        new  Thread(race,"乌龟").start();
    }

}