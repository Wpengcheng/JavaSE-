package com.wei.www.OOP.demon05;

public class Person {
    public void run() {
        System.out.println("run");
    }
}
/*
  public static void main(String[] args) {
        //Object>String
        //Object>Person>Teacher
        //Object>Person>Student
        Object object = new Student();
        System.out.println(object instanceof Student);//true
        System.out.println(object instanceof Person);//true
        System.out.println(object instanceof Object);//true
        System.out.println(object instanceof Teacher);//false
        System.out.println(object instanceof String);//false
        System.out.println("==============================================");
        Person person = new Student();
        System.out.println(person  instanceof Student);//true
        System.out.println(person  instanceof Person);//true
        System.out.println(person  instanceof Object);//true
        System.out.println(person  instanceof Teacher);//false
        //System.out.println(person instanceof String); 编译报错
        System.out.println("==============================================");
        Student student = new Student();
        System.out.println(student  instanceof Student);//true
        System.out.println(student  instanceof Person);//true
        System.out.println(student instanceof Object);//true
        //System.out.println(student  instanceof Teacher);编译报错
        //System.out.println(student instanceof String); 编译报错

        //高《---------- ---- ---- 低
        Person p1 = new Student();//低转高不需要强制转换
        //p1默认为 Person类型
        //高---------- ---- ---- >低
        //将p1转换成Student类型需要强制转换，转换成功后就可以使用Student类型的方法
        //Student student = (Student) p1;    student.go();
        //上面两个可以整合成一句代码，即转换又调用了方法
        ((Student) p1).go();

        //类型之间的转换
        Student student1 = new Student();
        student1.go();
        //高《----------  低
        Person person1 = student1;//低转高不需要强制转换
        // person1.go();   person1类型本质还是student，但不能使用原来的方法
        // 因此子类转换成父类有可能会丢失自己本来的一些方法


    }
 */