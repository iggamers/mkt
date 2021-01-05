package com.code.base.interactive.jv.adv;

import java.util.ArrayList;
import java.util.List;

public class D01Java {
    public static void main(String[] args) {
        // 使用kotlin扩展函数区别
        List<String> list = D01KotlinKt.myFilter(new ArrayList<>());
        System.out.println(list);

        List<Integer> list2 = D01KotlinKt.myFilter2(new ArrayList<>());
        System.out.println(list2);
    }
}
