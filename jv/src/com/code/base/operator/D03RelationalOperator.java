package com.code.base.operator;

// 关系运算符
public class D03RelationalOperator {
    public static void main(String[] args) {
        // 定义变量
        int i = 1;
        int j = 2;
        int k = 1;

        // == 相等
        System.out.println(i == j);
        System.out.println(i == k);
        System.out.println("--------");

        // != 不等
        System.out.println(i != j);
        System.out.println(i != k);
        System.out.println("--------");

        // > 大于
        System.out.println(i > j);
        System.out.println(i > k);
        System.out.println("--------");

        // >= 大于等于
        System.out.println(i >= j);
        System.out.println(i >= k);
        System.out.println("--------");

        // 如果不小心把==写成= 则把j的值赋值给i 然后输入i的值
        System.out.println(i = j);

    }
}
