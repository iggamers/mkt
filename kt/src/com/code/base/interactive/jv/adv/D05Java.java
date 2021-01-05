package com.code.base.interactive.jv.adv;

public class D05Java {
    public static void main(String[] args) {
        D05Kotlin myClass4 = new D05Kotlin();

        myClass4.method("hello world");
        myClass4.method(null);  // 调用kotlin中 则会抛出异常
    }
}
