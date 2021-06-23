package com.wei.www.Expection;

public class Test {
    public static void main(String[] args) {
        try {//try,catch 可以捕获异常，不会让程序因异常而停止
            new Test().test(1,0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
        }


    }
// 假设在方法中处理不了异常，可以在方法上用抛出异常
    public void test(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();//主动地抛出异常,一般在方法中使用
        }
        System.out.println(a / b);
    }
}









    /*
        int a = 1;
        int b = 0;
        try {//try监控区域,在区域里的代码如果有异常就可以监控到


    //栈类型异常
    public void a(){
        b();
    }
    public void b (){
        a();


    }
  */
