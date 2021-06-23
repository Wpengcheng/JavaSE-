package com.wei.www.OOP.demon06;

public class Person {

    {//2
      //代码块(匿名代码块)        匿名代码块在创建对象的时候就自动创建了,而且在构造器之前
        System.out.println("匿名代码块");
        //匿名代码块可以用来赋初始值
    }//1
    static {
        //静态代码块
        System.out.println("静态代码块");//静态代码块跟类一加载就直接执行，并且永久只执行一次
    }
    //3
    public Person() {
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println("==================================");
        Person person2 = new Person();
    }


}
