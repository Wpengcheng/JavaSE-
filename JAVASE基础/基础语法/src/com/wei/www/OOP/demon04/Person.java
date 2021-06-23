package com.wei.www.OOP.demon04;
//父类
public class Person {
    public void run(){
        System.out.println("跑");


    }
}
/*
  public static void main(String[] args) {
        //一个对象的实际类型是确定的，但可以指向的引用类型是不确定的
        //子类能调用的方法都是自己的或者继承父类的
        Student s1=  new Student();
        //父类可以指向子类，但不能调用子类独有的方法
        Person s2 = new Student();//父类的引用指向子类
        Object s3 =  new Student();
        s2.run();// son  如果子类重写了父类的方法，则父类执行子类的方法
        s1.run();// son
        s1.eat();//eat
        ((Student) s2).eat();//eat   把Person强制转换成Student类型
    }
 */