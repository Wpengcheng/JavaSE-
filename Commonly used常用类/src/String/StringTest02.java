package String;

import org.junit.Test;
/*String的实例化方式：
*方式一：通过字面量定义的方式
*方式二：通过new+构造器的方式
* */
public class StringTest02 {
    @Test
    public void test(){
        //此时的s1,s2的数据"JAVASE"是声明在方法区中的字符串常量池中
        String s1 = "JAVASE";//通过字面量定义的方式
        String s2 = "JAVASE";

        //此时的s3,s4保存的地址值，是数据在堆空间中开辟空间以后对应的地址值
        String s3 = new String("JAVASE");//通过new+构造器的方式
        String s4 = new String("JAVASE");

        //比较地址值
        System.out.println(s1==s2);//true
        System.out.println(s3==s4);//false
        System.out.println(s1==s3);//false
        System.out.println(s1==s4);//false

        Preson p1 = new Preson("Tom",12);
        Preson p2 = new Preson("Tom",12);

        System.out.println(p1.name.equals(p2.name));//true
        System.out.println(p1.name==p2.name);//true

    }


    public static void main(String[] args) {

    }
}

