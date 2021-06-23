package com.peng.cny;
//两个人同时去银行取钱
public class UnsafeBank {
    public static void main(String[] args) {

        Account account = new Account(100,"马化疼的账户");
        Drawing you = new Drawing(account,50,"yon");
        Drawing tx= new Drawing(account,100,"tx");


        you.start();
        tx.start();
    }
}

//银行账户
class Account{
    int money;
    String name;
    //构造器，初始化变量
    public Account(int money,String name) {
        this.money = money;//余额
        this.name = name;//卡名
    }
}
//银行取款
//用继承Thread的方式创建线程，因为不涉及到多个线程操作同个对象
class Drawing extends Thread{
    Account account;//取钱用的账户account
    int drawingMoney;//取了多少钱
    int nowMoney;
    public Drawing( Account account,int drawingMoney,String name){
        super(name);
        this.account=account;
        this.drawingMoney=drawingMoney;
    }
    @Override
    public  void run() {
        //锁的对象是变化的量，需要增删改查的量
        synchronized(account){// synchronized同步块可以锁任何对象
            //判断卡里的钱够不够
            if (account.money<drawingMoney){
                System.out.println(Thread.currentThread().getName()+"取得时候钱不够，取不了");
                return;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //卡剩下的钱
            account.money = account.money - drawingMoney;
            //你手里的钱
            nowMoney = nowMoney + drawingMoney;
            System.out.println(account.name+"余额为"+account.money);

            // this.getName()= Thread.currentThread().getName()
            System.out.println(this.getName()+"手里的钱"+nowMoney);

        }
    }
}