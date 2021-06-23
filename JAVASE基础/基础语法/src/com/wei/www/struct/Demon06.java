package com.wei.www.struct;
import java.util.Scanner;
public class Demon06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("账号");
        int a = scanner.nextInt();
        if (a == 1) {
            System.out.println("请输入密码");
            int b = scanner.nextInt();
            if (b == 2) {
                System.out.println("登陆成功");
                System.out.println("请选择要进行的操作");
                String c = scanner.next();
                if ("de".equals(c)) {
                    System.out.println("删除成功");
                }
            } else {
                System.out.println("密码输入错误");
            }
        } else {
            System.out.println("账号输入错误");
        }
    }
}
