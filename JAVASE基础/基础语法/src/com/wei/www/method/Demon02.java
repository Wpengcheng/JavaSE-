package com.wei.www.method;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Demon02 {
    public static void main(String[] args) {
        //实参
        int max = max(80,80);
        System.out.println(max);
    }
    //                     形参
    public static int max(int num1, int num2) {

        int result = 0;
        if (num1 > num2) {
            result = num1;

        } else if (num1 < num2) {
            result = num2;
        } else if (num1 == num2) {
            System.out.println(num1+"=="+num2);
            return 0;//终止方法
        }

            return  result;
    }
}