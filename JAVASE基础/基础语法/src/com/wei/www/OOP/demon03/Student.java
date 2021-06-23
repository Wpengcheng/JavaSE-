package com.wei.www.OOP.demon03;
//子类
public class Student extends Person {
    public Student() {
        //调用父类的有参构造器
        super("name");

        //隐藏代码：super(); 调用了父类的无参构造
        System.out.println("子类Student无参构造器执行了");
    }

    //私有的属性
    private String name = "铁男";

    public void print() {
        System.out.println("Student");
    }

    public void test1() {
        //调用自己类里的方法
        print();//Studemt
        this.print();//Studemt
        //调用父类里的方法
        super.print();//Person
    }


    //修饰符 返回值 方法名  形参
    public void test(String name) {
        //输出自己方法里的name
        System.out.println(name);//狂铁
        //用自己的属性name
        System.out.println(this.name);//铁男
        //调用父类里的属性name
        System.out.println(super.name);//kuangtie

    }


}
/*
 public static void main(String[] args) {
        Student student = new Student();
        student.test("狂铁");
    student.test1();
    }

 */