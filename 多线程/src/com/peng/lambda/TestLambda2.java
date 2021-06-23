package com.peng.lambda;

public class TestLambda2 {

    public static void main(String[] args) {
        //ILove love =(int a)->{
            //System.out.println("i love you" +a + "次");
      // };
        //简化   去掉参数返回值类型和括号和花括号（如果有多行代码就不能简化花括号）
        //用借口来实现对象
        ILove  love = a-> System.out.println("i love you" + a +"次");

        love.love(3000);
        }
    }
    interface ILove {
        void love(int a);
    }
