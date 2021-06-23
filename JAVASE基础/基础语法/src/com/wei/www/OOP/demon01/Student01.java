package com.wei.www.OOP.demon01;

public class Student01 {
    //private让属性私有
    private String name;//提供一些可以操作私有属性的方法！
    private int id;     //如get(获得这个数据)、set（给数据设置值)方法
    private int age;
    private String sex;
    //get获得这个数据
    public String getName() {
        return this.name;
    }
    //set给数据设置值
    public void setName(String name){
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        if (sex=="男"){
            System.out.println("威猛先生");
        }if (sex=="女"){
            System.out.println("女孩子");
        }
         if (sex!="男"&&sex!="女"){
             System.out.println("不男不女");
         }
    }
    public int getAge() {
        return age;
    }
   //通过内部的封装让程序更安全
    public void setAge(int age) {
        if (age>120||age<0){
            System.out.println("这货不是人");
        }else {
            this.age = age;
        }
    }
}
/*
 public static void main(String[] args) {
        Student01 s1 = new Student01();
        //set给数据设置值
        s1.setName("狂铁");
        //get获得这个数据
        System.out.println("我的名字:" + s1.getName());
        System.out.println("=============================");
        s1.setAge(1110);
        System.out.println("我的年龄为：" + s1.getAge());
        System.out.println("=============================");
        s1.setId(891121332);
        System.out.println("学号为：" + s1.getId());
        System.out.println("=============================");
        s1.setSex("你");

    }
 */