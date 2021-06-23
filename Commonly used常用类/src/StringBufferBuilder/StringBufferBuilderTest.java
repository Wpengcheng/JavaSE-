package StringBufferBuilder;

/*
* 测试关于StringBuffer，StringBuilder的使用
*String  StringBuffer   StringBuilder的异同:
* String             不可变的字符序列 底层使用char[]存储
* StringBuffer       可变的字符序列  让线程安全，但效率低  底层使用char[]存储
* StringBuilder      可变的字符序列 让线程不安全，但效率高  底层使用char[]存储
*源码分析
*  无参  String str = new String  char[] value = new char[0] 在底层创建了一个char[]，长度为0
*  有参  String str = new String("abc")   char[] value = new char[0]{'a','b','c'}  在底层创建了一个char[]{'a','b','c'}长度为3
*  无参  StringBuffer sb1 = new StringBuffer char[] value = new char[16] 在底层创建了一个char[16],长度为16
*  有参  StringBuffer sb2 = new StringBuffer("abc")  char[] value = new char["abc".length()+16] 在底层创建了一个char[19],长度为19
*扩容问题：如果要添加的数据底层数组盛不下了，那就需要扩容底层的数组。
*sb1.append('a');    value[0] = 'a';  添加数据的方法
*sb1.append('b');    value[1] = 'b';
* 默认情况下扩容为原来容量的两倍再+2，同时将原有的数组复制到新的数组中
* 意义：在开发中建议使用 StringBuffer(int capacity)或StringBuilder(int capacity)构造器，可以指定底层数组容量，避免出现扩容问题
*
* */
public class StringBufferBuilderTest {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("abc");
        sb1.setCharAt(0,'b');
        System.out.println(sb1);//bbc
        String sb2 = sb1+"efg";
        System.out.println(sb2);//bbcefg

        StringBuffer sb3 = new StringBuffer();
        System.out.println(sb3.length());//0  因为length的返回值是count  如果返回值是value长度就是16

        StringBuffer sb4 = new StringBuffer("abc");
        System.out.println(sb4.length());//3


    }

}
