package com.wei.www.OOP.demon03;
//父类
public class Person {
    public Person(String name) {
         this.name = name;
         System.out.println("父类Person无参构造器执行了");
          }

        //受保护的属性
        protected String name = "kuangtie";
         public void print(){
         System.out.println("Person");
        }


    }






