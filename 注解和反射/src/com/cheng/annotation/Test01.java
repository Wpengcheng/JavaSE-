package com.cheng.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @User Administrator
 * @Classname Test01
 * @Project 注解和反射
 * @Description 什么是注解
 * @Author wpcheng
 * @Create 2021-03-25-18:15
 * @Version 1.0
 */
public class Test01{
    public static void main(String[] args) throws ClassNotFoundException {
        //获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);//sun.misc.Launcher$AppClassLoader@18b4aac2

        //获取系统类加载器的父类加载器-->扩展类加载器
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);//sun.misc.Launcher$AppClassLoader@18b4aac2

        //获取扩展类加载器的父类加载器-->根类加载器
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);//null

        //测试当前类是由哪个类加载器加载的
        ClassLoader classLoader = Class.forName("com.cheng.annotation.Test01").getClassLoader();
        System.out.println(classLoader);//sun.misc.Launcher$AppClassLoader@18b4aac2

        //测试JDK内置类是由哪个类加载器加载的
        ClassLoader classLoader1 = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader1);//null

        //获得系统类加载器可以加载的路径
        String property = System.getProperty("java.class.path");
        System.out.println(property);


    }
}
