package String;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class StringTest05 {
/*
* 测试String类与其他结构的转换
* String-->基本数据类型,包装类  调用包装类的静态方法：parseXxx(str)
*基本数据类型,包装类-->String    调用String重载的valueOf(xxx)方法
* */
         @Test
         public void test1(){
         String str1= "123";
         int i = Integer.parseInt(str1);//转化为int类型
             System.out.println(i);
         String s = String.valueOf(i);//转化为String类型
             System.out.println(s);
         }

/*
* String用char[]的转换
* String-->char[]  ：调用String的toCharArray()方法
* char[]-->String  ：调用String的构造器
* */
         @Test
         public void test2(){
             String str1 = "acc123";
             char[] charArray = str1.toCharArray();//转化为char[]类型
             for (int i = 0; i <charArray.length ; i++) {
                 System.out.println(charArray[i]);
             }
             char[]  arr = new char[]{'h','e','l','l','o'};
             //调用String类的构造器
             String s = new String(arr);//转化为String类型
             System.out.println(s);
         }

/*
*String与byte[]之间的转换
* String-->byte[] :调用getBytes()方法
* byte[]-->String :调用String的构造器
* */
         @Test
    public void test3() throws UnsupportedEncodingException {
             String s1 = "123abc中国";
             //编码  字符串--》字节
             //解码  字节--》字符串
             //编码集和解码集要一致，不然会出现乱码


             byte[] bytes = s1.getBytes();//使用utf-8字符集进行编码
             System.out.println(Arrays.toString(bytes));
             byte[] gbks = s1.getBytes("gbk");//使用gdk进行编码
             System.out.println(Arrays.toString(gbks));

             String s = new String(bytes);//转化为String类型     解码
             System.out.println(s);




         }



}