package com.wei.www.Expection;

public class Test2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
       //用快捷键自动生成异常捕获     选中代码然后ctal+alt+t
        try {//监控区域
            System.out.println(a/b);
        } catch (Exception e) {
            System.exit(1);//假设出现异常就让程序结束
            e.printStackTrace();//打印错误的栈信息
        } finally {
        }

    }
}