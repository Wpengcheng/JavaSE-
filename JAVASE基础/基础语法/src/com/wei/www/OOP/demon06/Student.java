package com.wei.www.OOP.demon06;

public class Student {
    private static int age;//静态的变量,建议直接用类名调用
    private double score;//非静态变量

    //非静态方法可任意调用静态方法里的东西
    public void run() {
        go();
    }
//静态方法只能调用自己的方法，不能调用非静态的方法
    public static void go() {

    }


    public static void main(String[] args) {
        new Student().run();//调用非静态方法需要用实例化的对象.方法名来实现
        Student.go();//调用静态方法



        Student s1 = new Student();
        //通过类去调用里面的属性
        System.out.println(Student.age);
        //通过对象去调用里面的属性
        System.out.println(s1.age);
        System.out.println(s1.score);


    }

}
/*


 */