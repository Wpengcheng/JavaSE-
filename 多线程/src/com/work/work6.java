package com.work;

public class work6 {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer();
        StringBuffer s2 = new StringBuffer();


        //线程一
        new Thread(){//用匿名内部类的方式创建线程（继承Thread类）
            @Override
            public void run() {
                synchronized(s1){//线程一先获得s1的锁
                   s1.append("a");
                   s2.append(1);

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized(s2){//再获得s2的锁
                       s1.append("b");
                       s2.append(2);
                       //线程一只有同时获得了s1和s2的锁才能输出s1,s2
                       System.out.println(s1);
                       System.out.println(s2);
                   }
                }

            }
        }.start();

        //线程二
    new Thread(new Runnable() {//实现Runnable接口
        @Override
        public void run() {
            synchronized (s2) {//线程二先获得s2的锁
                s1.append("c");
                s2.append(3);

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (s1) {//再获得s1的锁
                    s1.append("d");
                    s2.append(4);

                    System.out.println(s1);
                    System.out.println(s2);
                }
            }

        }
    }).start();
}
}




