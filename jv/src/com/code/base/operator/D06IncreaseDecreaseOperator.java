package com.code.base.operator;

public class D06IncreaseDecreaseOperator {
    public static void main(String[] args) {
        // 定义变量
        int i = 10;
        System.out.println("i:" + i);

        // 单独使用 没有区别
        // i++;
        // ++i;
        // System.out.println("i:" + i);

        // 参与操作使用
        // int j = i++;  // 先赋值，后自加
        int j = ++i;     // 先自加，后赋值
        System.out.println("i:" + i);
        System.out.println("j:" + j);
    }
}
