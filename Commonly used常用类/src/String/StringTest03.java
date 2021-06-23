package String;

import org.junit.Test;

/*
* String不同拼接操作的对比
* 总结
* 常量与常量的拼接结果在常量池中，且常量池中不会存在相同内容的常量
* 只要其中一个是变量，结果就在堆中
* 如果拼接的结果调用intern()方法，返回值就在常量池中
* */
public class StringTest03 {
    @Test
    public void Test() {
        String s1 = "JAVAEE";
        String s2 = "hadoop";

        String s3 = "JAVAEEhadoop";
        String s4 = "JAVAEE" + "hadoop";

        String s5 = s1+"hadoop";
        String s6 = "JAVAEE"+s2;
        String s7 = s1 + s2;

        System.out.println(s3 == s4);//true
        System.out.println(s3 == s5);//false
        System.out.println(s3 == s6);//false
        System.out.println(s3 == s7);//false
        System.out.println(s5 == s6);//false
        System.out.println(s5 == s7);//false
        System.out.println(s6 == s7);//false

        String s8 = s5.intern();//返回得到的s8使用的常量值是已经存在的"JAVAEEhadoop"
        System.out.println(s3==s8);//true

    }
}