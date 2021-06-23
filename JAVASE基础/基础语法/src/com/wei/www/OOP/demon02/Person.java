package com.wei.www.OOP.demon02;
//Person 人  父类
//在java中所有的类都默认直接或间接继承object
public class Person {
    //父类属性私有，子类无法直接来操作，但可以通过get/set来操作
        private int money = 1000;



       public int getMoney () {
            return money;
       }
       public int money1 = 10000000;
    public void setMoney ( int money){
            this.money = money;
        }




    public void say () {
            System.out.println("说了一句话");
            System.out.println(money);

        }

    }


/*
 public static void main(String[] args) {
        Student student = new Student();
        student.say();
        System.out.println(student.money1);
    }

 */
