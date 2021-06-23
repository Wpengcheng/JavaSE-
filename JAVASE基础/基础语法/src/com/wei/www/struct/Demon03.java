package com.wei.www.struct;

import java.util.Scanner;

public class Demon03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //考试分数大于60就是及格，小于60分就不及格
        System.out.println("请输入成绩：");
        int score = scanner.nextInt();
        if (score>=60&&score<120) {
            System.out.println("及格");
        }else if (score<60){
            System.out.println("不及格");
        }else if (score>120){
            System.out.println("改错了");
        }else if (score==120){
            System.out.println("满分");





        }



     scanner.close();
    }
}
