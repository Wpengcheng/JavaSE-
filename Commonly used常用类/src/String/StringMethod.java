package String;

import org.junit.Test;
/*测试String的常用方法
*简单方法：
*int          length():返回字符串长度 return value.length
*char         charAt(int index): 返回某索引处的字符 return value[index]
*boolean      isEmpty(): 判断是否是空字符串 return value.length == 0
*String       toLowerCase() :将String中的所有字符转换成小写
*String       toUpperCase() :将String中的所有字符转换成大写
*String       teim():返回字符串的副本，忽略前后的空格
*boolean      equals(Object obj)：比较字符串的内容是否相等
*boolean      equalsIgnoreCase(String anotherString):与equals方法类似，但忽略大小写
*String       concat(String str): 将两个字符串连接，等价于+
*int          compareTo()：比较两个字符串的大小
*String       substring(int beginIndex)：返回一个新的字符串，它是此字符串的从beginIndex开始截取的到最后一个字符串
*String       substring(int beginIndex ，int endIndex)： ：返回一个新的字符串，它是此字符串从 int beginIndex开始截取到endIndex（不包含  左闭右开）的一个字符串
* */
public class StringMethod {

    //测试String的简单常用方法
    @Test
    public void Test1() {
        String s1 = "helloWORLD";
        //返回字符串长度
        System.out.println(s1.length());
        System.out.println("*************************");

        //返回某索引处的字符
        System.out.println(s1.charAt(0));//h
        System.out.println(s1.charAt(1));//e

        System.out.println("*************************");
        //判断是否是空字符串
        System.out.println(s1.isEmpty());//false

        System.out.println("*************************");
        //将String中的所有字符转换成小写
        String s2= s1. toLowerCase();
        System.out.println(s2);//helloworld
        //将String中的所有字符转换成大写
        String s3= s1. toUpperCase();
        System.out.println(s3);//HELLOWORLD

        System.out.println("*************************");
        //返回字符串的副本，忽略前后的空格.中间的空格不能取消，用来用户输入用户名
        String s4 = "    he llo   world     ";
        String s5 = s4.trim();
        System.out.println("------"+s4+"-------");//------    he llo   world     -------
        System.out.println(s5);//he llo   world

        System.out.println("*************************");
        //比较字符串的内容是否相等
        System.out.println(s1.equals(s2));//false

        System.out.println("*************************");
        //与equals方法类似，但忽略大小写
        System.out.println(s2.equalsIgnoreCase(s3));//true

        System.out.println("*************************");
        //将两个字符串连接，等价于+  s1+s2
        System.out.println(s1.concat(s2));

        System.out.println("*************************");
        //比较两个字符串的大小  涉及到字符串排序
        String s6 = "abc";
        String s7 = "abd";
        //比较原理：a=97,b=98,c=99 d=100 上面逐个减下面
        System.out.println(s6.compareTo(s7));//-1  负数说明s6比s7小

        System.out.println("*************************");
        String s8 = "五个赛季边路王者";
        System.out.println(s8.substring(2));//赛季边路王者
        System.out.println(s8.substring(2,6));//赛季边路


    }
/*
* 复杂方法
*boolean    endsWith(String suffix)：测试此字符串是否以指定的后缀结束
*boolean    startWith(String prefix)：测试此字符串是否以指定的前缀开始
*boolean    startWith(String prefix,int toffset)：测试此字符串从指定索引开始的子字符串是否以指定前缀开始
*boolean    contains(CharSequence  s)：当且仅当此字符串包含指定的char值序列时，返回true
*查找
* int        indexOf(String str)：返回指定子字符串在此字符串中第一次出现处的索引
*int        indexOf(String str,int fromIndex)：返回指定子字符串在此字符串中第一次出现处的索引,从指定的位置开始索引
*int        lastindexOf(String str)：返回指定子字符串在此字符串中最右边出现处的索引
*int        lastindexOf(String str,int fromIndex)：返回指定子字符串在此字符串中最后一次出现处的索引,从指定的位置索引进行反向搜索
* */

    //测试String的复杂常用方法
    @Test
    public void Test2() {
        String s1 = "helloworld";

        //测试此字符串是否以指定的后缀结束
        boolean b1 = s1.endsWith("ld");
        System.out.println(b1);//true
        //测试此字符串是否以指定的前缀开始
        boolean b2 = s1.startsWith("hel");
        System.out.println(b2);//true

                          //                      以第二位开头
        boolean b3 = s1.startsWith("llow", 2);
        System.out.println(b3);

        //当此字符串包含指定的char值序列时，返回true
        String s2 = "owo";
        System.out.println(s1.contains(s2));//true

        //返回指定子字符串在此字符串中第一次出现处的索引，默认从头开始找
        System.out.println(s1.indexOf("lo"));//3
        //如果没有索引到就返回-1

        //从指定的位置开始索引4
        System.out.println(s1.indexOf("lo",4));//-1 如果索引不到就返回-1

        //从右到左索引
        System.out.println(s1.lastIndexOf("or"));//6

        //从指定的位置进行反向索引指定字符串的位置，然后返回指定字符串的索引
        System.out.println(s1.lastIndexOf("ow",6));//4


    }
/*
* 替换
* String       replace(char oldChar,char newChar)：返回一个新的字符串，它是通过用newChar 替换此字符串中出现的所有 oldCha得到的
* String       replace(CharSequence target, CharSequence  replacement)：使用指定的字面值替换序列替换此字符串所有匹配字面值目标序列的子字符串
* String       replaceAll(String  regex, String replacement)：使用给定的replacement替换此字符串所有匹配给定的正则表达式的子字符串
* String       replaceFirst(String  regex, String  replacement)：使用给定的replacement替换此字符串匹配给定的正则表达式的第一个子字符串
* 匹配
* boolean      matches(String regex)：告知此字符串是否匹配给定的正则表达式
* 切片
* String[]     split(String regex)：根据给定正则表达式的匹配拆分此字符串
* String[]     split(String regex, int limit)：根据给定正则表达式的匹配拆分此字符串，最多不超过limit个，如果超过了，剩下的全部都放到最后一个元素中
* */
    @Test
    public void Test3() {
        String str1 = "五个赛季王者边路王者";

        //后面的字符串替换前面的字符串
        System.out.println(str1.replace("王者","狂"));






    }


}
