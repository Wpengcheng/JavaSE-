package com.wei.www.OOP.demon08;
//定义的关键字  interface
//接口都需要要有实现类
public interface UseService {
   //接口中定义的属性默认都是常量   public static final int age = 88;
                               int age = 88;//也可以这样定义，更简洁


    //借口中的定义的方法默认都是抽象的,因此在接口里定义方法可以不加public abstract
         void add(String name);
         void delet(String name);
         void update(String name);
         void query(String name);
         void run();
    }

