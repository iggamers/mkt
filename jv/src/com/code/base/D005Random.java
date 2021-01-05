package com.code.base;

import java.util.Random;
import java.util.Scanner;

/*
	Random

	作用：
		用于产生一个随机数

	使用步骤：
		1:导包
			import java.util.Random;
		2:创建对象
			Random r = new Random();
		3:获取随机数
			int number = r.nextInt(10);
			获取数据的范围：[0,10) 包括0,不包括10
*/

public class D005Random {
    public static void main(String[] args) {
        // 创建对象
        Random r = new Random();

        // 用循环获取10个随机数
        for(int i=0; i<10; i++) {
            // 获取随机数
            int number = r.nextInt(10);
            System.out.println("number:" + number);
        }

        // 需求：获取一个1-100之间的随机数
        int x = r.nextInt(100) + 1;
        System.out.println(x);
    }

    /*
        猜数字

        需求：
            程序自动生成一个1-100之间的数字，使用程序实现猜出这个数字是多少？
            当猜错的时候根据不同情况给出相应的提示

            如果猜的数字比真实数字大，提示你猜的数据大了
            如果猜的数字比真实数字小，提示你猜的数据小了
            如果猜的数字与真实数字相等，提示恭喜你猜中了
    */
    public static void randomTest(){
        //要完成猜数字的游戏，首先需要有一个要猜的数字，使用随机数生成该数字，范围1到100
        Random r = new Random();
        int number = r.nextInt(100) + 1;

        while(true) {
            //使用程序实现猜数字，每次均要输入猜测的数字值，需要使用键盘录入实现
            Scanner sc = new Scanner(System.in);

            System.out.println("请输入你要猜的数字：");
            int guessNumber = sc.nextInt();

            //比较输入的数字和系统产生的数据，需要使用分支语句。这里使用if..else..if..格式，根据不同情况进行猜测结果显示
            if(guessNumber > number) {
                System.out.println("你猜的数字" + guessNumber + "大了");
            } else if(guessNumber < number) {
                System.out.println("你猜的数字" + guessNumber + "小了");
            } else {
                System.out.println("恭喜你猜中了");
                break;
            }
        }

    }
}
