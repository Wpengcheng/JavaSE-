package com.wei.www.OOP.demon01;

public class Person {

    //一个类即使什么都不写，也会存在一个构造器（方法）
    public String  name;

    //定义一个构造器
    //构造器的作用   1.用来实例化初始值    2.使用new关键字本质就是在调用构造器
    public Person() {
        this.name = "kuangtie";
    }
        //有参构造器  一旦定义了有参构造，无参就必须显示的定义
    public Person(String 狂铁) {
            this.name = 狂铁;
        }

    public void run() {
    }
}


   /* public static void main(String[] args) {
        Person person = new Person("狂");

        System.out.println(person.name);



    }
*/
