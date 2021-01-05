package com.code.base.operator;

public class D04LogicalOperator {
    public static void main(String[] args) {
        // 定义变量
        int i = 10;
        int j = 20;
        int k = 30;

        // 与运算 & 有false则false
        System.out.println((i > j) & (i > k)); //false & false
        System.out.println((i < j) & (i > k)); //true & false
        System.out.println((i > j) & (i < k)); //false & true
        System.out.println((i < j) & (i < k)); //true & true
        System.out.println("--------");

        // 或运算 | 有true则true
        System.out.println((i > j) | (i > k)); //false | false
        System.out.println((i < j) | (i > k)); //true | false
        System.out.println((i > j) | (i < k)); //false | true
        System.out.println((i < j) | (i < k)); //true | true
        System.out.println("--------");

        // 异或运算 ^ 相同为false，不同为true
        System.out.println((i > j) ^ (i > k)); //false ^ false
        System.out.println((i < j) ^ (i > k)); //true ^ false
        System.out.println((i > j) ^ (i < k)); //false ^ true
        System.out.println((i < j) ^ (i < k)); //true ^ true
        System.out.println("--------");

        // 非运算 !
        System.out.println((i > j)); //false
        System.out.println(!(i > j)); //!false
        System.out.println(!!(i > j)); //!!false
        System.out.println(!!!(i > j)); //!!!false

        // 短路逻辑运算符
        // && 有false则false 第一个条件如果为假,则不再判断第二条件
        System.out.println((i > j) && (i > k)); //false && false
        System.out.println((i < j) && (i > k)); //true && false
        System.out.println((i > j) && (i < k)); //false && true
        System.out.println((i < j) && (i < k)); //true && true
        System.out.println("--------");

        // || 有true则true 第一个条件如果为真,则不再判断第二条件
        System.out.println((i > j) || (i > k)); //false || false
        System.out.println((i < j) || (i > k)); //true || false
        System.out.println((i > j) || (i < k)); //false || true
        System.out.println((i < j) || (i < k)); //true || true
        System.out.println("--------");

        // &&和&
        // System.out.println((i++ > 100) & (j++ > 100)); //false & false
        System.out.println((i++ > 100) && (j++ > 100)); //false && false
        System.out.println("i:" + i);
        System.out.println("j:" + j);
    }
}
