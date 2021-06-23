package StringBufferBuilder;

import org.junit.Test;

/*
* 测试StringBuffer,StringBuilder的常用方法  以StringBuffer为例
* StringBuffer   append(xxx):提供了很多的append()方法，用于进行字符串拼接
* StringBuffer   delete(int start,int end):删除指定位置的内容
* StringBuffer   replace(int start,int end,String str):把[start,end)位置进行替换为str
* StringBuffer   insert(int offset,xxx):在指定位置插入xxx
* StringBuffer   reverse() : 把当前字符序列逆转
* subString(int start,int end):返回一个从start开始到end索引结束的左闭右开区间的子字符串
*
* */
public class StringBufferBuilderMethod {
    @Test
    public void test1(){
        StringBuffer sb1 = new StringBuffer();
        //字符串拼接
        sb1.append(1);
        sb1.append('1');
        sb1.append("abcde");
        System.out.println(sb1);//11abcde

        //删除指定位置的内容     左闭右开
        sb1.delete(1,3);
        System.out.println(sb1);//1bcde

        //对指定位置进行替换    左闭右开
        sb1.replace(1,3,"zz");
        System.out.println(sb1);//1zzde

        //在指定位置后面插入
        sb1.insert(1,"ab");
        System.out.println(sb1);//1abzzde

        //把当前字符序列逆转
        sb1.reverse();
        System.out.println(sb1);//edzzba1

        String sb2 = sb1.substring(1,3);
        System.out.println(sb2);
        sb2.toString();
        System.out.println(sb2);

    }








}
