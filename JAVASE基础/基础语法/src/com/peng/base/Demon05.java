package com.peng.base;

public class Demon05 {
    //类变量  static     从属于类，与类一起变化
    static double salary = 2500.;
    //实例变量：从属与对象（类）如果不自行初始化，将会输出这个类型的默认值
    //所有的数值类型默认值为0或0.0
    //布尔值默认是false
    //除了基本类型其他数据默认值都是null
    //=====================================================
    String name;
    int age;

    public Demon05() {
    }
     //====================================================
    public static void main(String[] args) {   //main方法
        //局部变量，只在这两个括号之间有效，并且使用前必须要声明和初始化值
        //======================================================
        int i = 10;
        System.out.println(i);
        Demon05 demon05 = new Demon05();
        System.out.println(demon05.age);  //int默认值为0
        System.out.println(demon05.name);  //String默认值为null
        //类变量
        System.out.println(salary);
    }
}

