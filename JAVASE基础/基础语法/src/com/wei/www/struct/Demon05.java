package com.wei.www.struct;

import java.util.Scanner;

public class Demon05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("跑步成绩");
        int time = scanner.nextInt();//5
        if (time <= 10) {
            System.out.println("进入决赛");
            System.out.println("请输入男女组");
            String gender = scanner.next();//male //男子
            if ("male".equals(gender)) {
                System.out.println("男子");
            } else if ("female".equals(gender)) {
                System.out.println("女子");
            } else {
                System.out.println("泰国");
            }
        } else {
            System.out.println("淘汰");
            scanner.close();

        }

    }
}