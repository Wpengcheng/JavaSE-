package com.peng.lambda;

public class TestLambda1 {
    //静态内部类Like2      用静态内部类的方法操作
    static class Like2 implements ILike {
        @Override
        public void lambda() {
            System.out.println("You Like lambda");
        }
    }
    public static void main(String[] args) {
        ILike like = new Like();
        like.lambda();

         like = new Like2();
         like.lambda();
        //局部内部类     用局部内部类的方法操作
        class Like3 implements ILike {
            @Override
            public void lambda() {
                System.out.println("He Like lambda");
            }
        }
         like = new Like3();
         like.lambda();

        //匿名内部类   借助接口或父类   用匿名内部类的方法操作
         like= new ILike() {
            @Override
            public void lambda() {
                System.out.println("She Like lambda");
            }
        };
        like.lambda();

        //用lambda简化    用lambda表达式的方法操作
        //因为只有ILike这一个接口，然后ILike接口只有一个类，类里面也只有lambda一个方法，表达式会自动推导
        like = ()-> {
            System.out.println("Her Like lambda");
        };

        like.lambda();
    }
}
    //定义一个函数式接口   函数式接口：只包含唯一一个抽象方法的接口
    //对于函数式接口，可以通过lambda表达式来创建该接口的对象
    interface ILike {
         void lambda();//抽象方法  public abstracrt可以省略
    }
    //实现类Like,实现函数接口     用实现类的方法操作
    class Like implements ILike {
        @Override
        public void lambda() {
            System.out.println("I Like lambda");
        }
    }
