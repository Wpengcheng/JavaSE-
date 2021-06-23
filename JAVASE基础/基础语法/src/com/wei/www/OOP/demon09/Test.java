package com.wei.www.OOP.demon09;

public class Test {
    public static void main(String[] args) {
        //匿名内部类
        //没有名字初始化类  new Apple()不用讲实例保存到变量中
        new Apple().eat();
        new UserService() {
            @Override
            public void hello() {

            }
        };
    }

}
class Apple{
    public void eat(){
        System.out.println("1");
    }
}interface UserService{
    void hello();

}