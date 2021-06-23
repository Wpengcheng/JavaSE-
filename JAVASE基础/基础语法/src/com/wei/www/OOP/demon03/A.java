package com.wei.www.OOP.demon03;
//子类
public class A extends B {
    //Override重写
    @Override//注解，有功能的注释
    public void test() {
        System.out.println("A=>test()");
    }
}

/*
  public static void main(String[] args) {
        A a = new A();
        a.test();
        //父类的引用指向子类
        B b = new A();//子类重写了父类的方法
        b.test();
    }

 */