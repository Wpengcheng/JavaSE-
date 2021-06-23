package com.peng.demon01;

/*测试Thread类的方法
start():启动线程，并执行对象的run()方法
run() ：线程在被调度时执行的操作
currentThread()：静态方法，返回执行当前代码的线程
getName()：获取当前线程的名字
setName()：设置当前线程的名字
yield()：释放CPU的执行权
join()：如果在线程A中调用B线程的join()，线程A将会进入阻塞状态，等线程B执行完毕后才会继续执行A线程
*/

public class ThreadMethodTest {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1("金鱼姬");
        //thread1.setName("狂铁");//设置当前线程的名字
        thread1.start();
        //给主线程设置名字
        //    返回执行当前代码的线程
        Thread.currentThread().setName("主线程");
        for (int i = 0; i <100 ; i++) {
            if (i % 2==0){
                System.out.println(Thread.currentThread().getName()+"; "+i);
            }
            if (i==20)
            try {
                thread1.join();//当主线程执行到20时开始执行另一个线程
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
       //判断当前线程是否存活           false
        System.out.println(thread1.isAlive());
    }
}


class Thread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            if (i % 2==0){
               // try {
                   // sleep(1000);
               // } catch (InterruptedException e) {
                  //  e.printStackTrace();
               // }
                System.out.println(Thread.currentThread().getName()+"; "+i);
            }

            //if (i%20==0);
           // yield();//释放CPU的执行权
        }


    }
    //利用构造方法也可以给线程命名
       public  Thread1(String name){
        super(name);
       }


}