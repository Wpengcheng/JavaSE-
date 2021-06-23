package com.wei.www.OOP.demon09;
//          外部类
public class Outer {



    private int id = 1;

    public static void out() {
        System.out.println("这是外部类的方法");
    }

    //内部类
    public class Inner {
        public void in() {
            System.out.println("这是内部类的方法");
        }

        //内部类可以访问外部类的一些私有属性
        public void getID() {
            System.out.println(id);
        }

    }
}
//一个java类中可以有多个class类，但只能有一个public class
class A{
}

 /*
    public void method() {
        //局部内部类
        class Inner {

        }

    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        //通过这个外部类来实例化内部类
        Outer.Inner inner=   outer.new Inner();
        inner.in();
        outer.out();
        inner.getID();
    }
  */