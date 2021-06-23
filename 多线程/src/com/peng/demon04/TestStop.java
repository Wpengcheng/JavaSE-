package com.peng.demon04;
/*测试停止线程
* 建议线程正常停止，利用次数（运行多少次后，线程自动停止），不建议死循环
* 设置一个标识位flag
* 不推荐使用JDK提供的stop()、destroy()方法过时的方法
* */
public class TestStop implements Runnable{
    //1，设置一个标志位
    private boolean flag = true;

    @Override
    public void run() {
        //线程体
        int i = 0;
        while (flag){//while (flag)=while (flag==true)
            System.out.println("run......Thread"+i++);
        }
    }
    //2,设置一个公开的方法停止线程，
    public void stop1(){
        //转换标志位
        this.flag = false;
    }
    public static void main(String[] args) {
        TestStop testStop = new TestStop();
        new Thread(testStop).start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("main"+i);
            if (i==900){//i到900时，TestStop线程停止，但main线程依然执行
                //通过调用stop1方法来切换标志位，停止线程
                testStop.stop1();
                System.out.println("线程要停止了");
            }
        }
    }
}
