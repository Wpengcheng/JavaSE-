package String;


import org.junit.Test;

//String类的使用

public class StringTest01 {

   @Test
   public void Test(){
       String s1 = "abc";//字面量的定义方式
       //通过字面量的定义方式给字符串赋值(不同于new)，此时的字符串值声明在字符串常量池中（字符串常量池在方法区中）
      // 字符串常量池
       String s2 = "abc";

       //s1 = "hello";当对字符串重新赋值时，需要重新指定赋值区域，不能使用原有的字符数组赋值

       // 字符串常量池不会存储相同内容的字符串
       System.out.println(s1==s2);//比较s1,s2的地址值     true
       System.out.println(s1);//abc
       System.out.println(s2);//abc
       System.out.println("**********************************");
       String s3 = "abc";
       s3 +="def";
       //当对现有的字符串进行连接操作时，也需要重新指定赋值区域，不能使用原有的字符数组value赋值
       System.out.println(s3);//abcdef
       System.out.println("**********************************");

       //当对现有的字符串的某个位置上的内容进行操作时，也需要重新指定赋值区域，不能使用原有的字符数组value赋值
       String s4 = "abc";
       String s5 = s4.replace("a","b");
       System.out.println(s4);//abc
       System.out.println(s5);//bbc


   }





    public static void main(String[] args) {

    }
}
