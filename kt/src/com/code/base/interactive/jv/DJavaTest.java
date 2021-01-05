package com.code.base.interactive.jv;

public class DJavaTest {
    public static void main(String[] args) {
        // 我们无法通过new关键字来创建Kotlin编辑器自动生成的以Kt结尾的类的实例
        // 因为在生成的字节码中没有不带参数的构造方法
        // D02TestKt d02TestKt = new D02TestKt();
        D02TestKt.D02Method();
        System.out.println(D02TestKt.getD02Str());
        System.out.println("-----------");

        D03Test.myPrint();
        System.out.println("-----------");
        D04Test person = new D04Test();

        System.out.println(person.getName());
        System.out.println(person.age);

        System.out.println("-----------");

        D05Person.Companion.test1();
        D05Person.Companion.test2();
        D05Person.test2();

        System.out.println("-----------");
        System.out.println(D05Person.Companion.getName());
        System.out.println(D05Person.age);

    }
}
