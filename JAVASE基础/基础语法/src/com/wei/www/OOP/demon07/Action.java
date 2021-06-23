package com.wei.www.OOP.demon07;
//abstract  抽象类
public abstract class Action {

//约束
    //抽象方法，只有方法名字，没有方法实现！
    public abstract void doSomething();
    //抽象类的特点 1.抽象类不能new出来，只能靠子类去实现他
    //             抽象类中可以写普通方法，但抽象方法必须在抽象类中
    //              抽象类：抽象的抽象

    public Action() {
    }
}
