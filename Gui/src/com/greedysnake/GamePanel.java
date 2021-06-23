package com.greedysnake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

//游戏的面板
public class GamePanel extends JPanel implements KeyListener, ActionListener{
    //定义蛇的数据结构（长度，坐标，方向，启动状态，定时器）
    int length;//蛇的长度
    int[] snakeX = new int[600];//蛇的x坐标
    int[] snakeY = new int[500];//蛇的y坐标
    //定义蛇头的初始化方向
    String direction;

    //定时器                  100ms执行一次
    Timer timer =new Timer(100,this);

    //定义食物的坐标
    int foodx;
    int foody;
    Random random =new Random();

    //定义游戏的失败状态
    boolean isFail = false;//默认的失败状态为关闭
    //定义成绩
    int score;

    //定义游戏的初始状态为关闭
    boolean isStart = false;


    //构造器
    public GamePanel(){
        init();
        //获得焦点事件
        this.setFocusable(true);
        //获得键盘监听事件
        this.addKeyListener(this);
        //游戏开始定时器也开始
        timer.start();
    }
    //设置一个初始化蛇的方法
    public void init(){
        //小蛇初始化为三节
        length = 3;//小蛇每动一下坐标就加25
        snakeX[0] = 100;snakeY[0] = 100;//第一节的坐标
        snakeX[1] = 75;snakeY[1] = 100;//第二节的坐标
        snakeX[2] = 50;snakeY[2] = 100;//第三节的坐标
        //蛇头的初始化方向为右
        direction = "R";

        score = 0;

        //食物的初始化 ,把食物随机分布在界面上     边界
        foodx = 25+25*random.nextInt(34);
        foody = 75+25*random.nextInt(24);
    }
    @Override//  用画笔绘制游戏里的所有组件
    public void paintComponent(Graphics g) {
        super.paintComponent(g);//用于清屏

        //绘制静态的游戏面板
        this.setBackground(Color.white);

        //用当前的画笔把头部广告栏图片画到组件上
        Data.header.paintIcon(this,g,25,11);

        //黑色的游戏背景
        g.fillRect(25,75,850,575);

        //画食物
        Data.food.paintIcon(this,g,foodx,foody);

        //画积分
        g.setColor(Color.white);
        g.setFont(new Font("微软雅黑",Font.BOLD,18));
        g.drawString("长度"+length,750,35);
        g.drawString("分数"+score,750,50);


        //把初始化的小蛇画上去
        //控制初始化蛇头的方向
        if (direction.equals("R")){
            Data.right.paintIcon(this,g,snakeX[0],snakeY[0]);
        }else if (direction.equals("L")) {
            Data.left.paintIcon(this, g, snakeX[0], snakeY[0]);
        }else if (direction.equals("U")) {
            Data.up.paintIcon(this, g, snakeX[0], snakeY[0]);
        }else if (direction.equals("D")) {
            Data.down.paintIcon(this, g, snakeX[0], snakeY[0]);
        }
        //身体长度是个动态变量
        for (int i = 1; i <length ; i++) {
            Data.body.paintIcon(this,g,snakeX[i],snakeY[i]);
        }
         //游戏状态为开始
        if (isStart==false){
            //字体颜色
            g.setColor(Color.white);
            //设置字体                           粗体
            g.setFont(new Font("微软雅黑",Font.BOLD,40));
            //把字体画上去
            g.drawString("按下空格开始游戏",300,300);
        }
        //游戏状态为失败
        if (isFail){
            //字体颜色
            g.setColor(Color.red);
            //设置字体                           粗体
            g.setFont(new Font("微软雅黑",Font.BOLD,40));
            //把字体画上去
            g.drawString("失败，按下空格重新开始",300,300);
        }

    }

    //键盘监听事件@Override

    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();//获得键盘的键码
        if (keyCode == KeyEvent.VK_SPACE){//如果按下的是空格键
            if (isFail) {//先判断游戏状态，如果游戏状态是失败，空格的作用是重新开始
                isFail = false;
                init();
            }else {
                isStart = !isStart;//否则是启动
            }
            repaint();//重新绘制
        }
         //小蛇移动,由蛇头控制移动方向
        if (keyCode==KeyEvent.VK_UP){
            direction="U";
        }else if (keyCode==KeyEvent.VK_DOWN){
            direction="D";
        }else if (keyCode==KeyEvent.VK_LEFT){
            direction="L";
        }else if (keyCode==KeyEvent.VK_RIGHT){
            direction="R";
        }
    }
    @Override//定时器的事件监听，需要通过固定事件来刷新，如1秒10次（小蛇移动的频率）
    public void actionPerformed(ActionEvent e) {
        if (isStart && isFail==false) {//如果游戏是开始状态并且不属于失败状态，就让小蛇动起来

            //吃食物
            if (snakeX[0]==foodx && snakeY[0]==foody){
                //吃完食物,长度+1
                length++;
                //分数+10
                score=score+10;
                //再次随机生成食物
                foodx = 25+25*random.nextInt(34);
                foody = 75+25*random.nextInt(24);

            }

            //蛇的身体移动
            for (int i = length-1;i > 0;i--){
                snakeX[i] = snakeX[i-1];
                snakeY[i] = snakeY[i-1];
            }
            //头部走向加边界判断  如果蛇的头部穿过边界则从另一边出来
            if (direction.equals("R")) {
                snakeX[0] = snakeX[0] + 25;
                if (snakeX[0]>850){ snakeX[0] = 25;}

            }else if (direction.equals("L")) {
                 snakeX[0] = snakeX[0] - 25;
                 if (snakeX[0]<25) { snakeX[0] = 850;}

            }else if (direction.equals("U")) {
                 snakeY[0] = snakeY[0] - 25;
                 if (snakeY[0]<75) { snakeY[0] = 650;}

             }else if (direction.equals("D")) {
                  snakeY[0] = snakeY[0] + 25;
                  if (snakeY[0]>650) { snakeY[0] = 75;}
            }

            //失败状态的判定，撞到自己就算失败
            for (int i = 1; i < length; i++) {//把身体坐标遍历出来
               //如果头坐标和身体坐标重合就撞到自己
                if (snakeX[0]==snakeX[i] && snakeY[0]==snakeY[i]);
                isFail=true;

            }

           repaint();
        }
        timer.start();//定时器开启
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
    @Override
    public void keyReleased(KeyEvent e) {

    }
}
