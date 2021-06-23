package com.peng.base;

public class Demon02 {
    public static void main(String[] args) {
        //整数拓展：进制    二进制0b   十进制   八进制0     十六进制0x
        int i = 10;
        int i2 = 0b10;
        int i3 = 010;
        int i4 = 0x10;
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println("=====================================");
        //浮点数拓展 （最好完全避免使用浮点数比较）
        //浮点数表现的字长是有限的，也是离散的，浮点数一般都会存在舍入误差，因此结果只是个大约数，接近但不等于
        float a = 0.1F;
        double b = 0.1D;
        System.out.println(a);
        System.out.println(b);
        System.out.println((double)a == b);
        float c = 1.21212122E9F;
        float d = c + 1.0F;
        System.out.println(c);
        System.out.println(d);
        System.out.println(c == d);
        System.out.println("=====================================");
        //字符强制转换成数字
        char e1 = '魏';
        char e2 = '鹏';
        char e8 = '程';
        char num1 = 39759;
        char num2 = 40527;
        char num3 = 31243;

        System.out.println(e1);//高转低 强制转换
        System.out.println((int)e1);
        System.out.println(e2);
        System.out.println((int)e2);
        System.out.println(e8);
        System.out.println((int)e8);
        System.out.println(num1);//低转高  自动转换
        System.out.println(num2);
        System.out.println(num3);

        System.out.println("=====================================");
        //数字转换为字符
        char e3 = '\u9999';
        System.out.println(e3);
        char e4 = '\u0065';
        System.out.println(e4);
     
        System.out.println("=====================================");
        //转义字符 \t制表符    \n换行符
        System.out.println("Hello\tWorld");
        System.out.println("Hello\nWorld");
        System.out.println("=====================================");
        //布尔值拓展（一般用来判断）
        boolean flag = true;
        if (flag==true){
            //判断里面的东西是不是为真
        };
        //if(flag); 两行代码一样，上面老手写法，下面新手
        }

        }


