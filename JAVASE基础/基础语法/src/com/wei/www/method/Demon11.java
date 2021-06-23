package com.wei.www.method;
            //引用传递：对象 （类）   本质还是值传递
public class Demon11 {
    public static void main(String[] args) {
        //实例化的过程
        Person person = new Person();
        System.out.println(person.name);//默认值为null
        //调用charge的方法
        Demon11.change(person);
        System.out.println(person.name);
    }
                public static void change(Person person) {
                   //对象
                   person.name = "狂铁";
                }
}
//定义了一个类Person
class Person{
    //  name是一个属性
    String name;



}
