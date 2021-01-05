package com.code.base.oop.classes;
/*
    成员变量
        使用private修饰

    构造方法
        提供一个无参构造方法
        提供一个带多个参数的构造方法

    成员方法
        提供每一个成员变量对应的setXxx()/getXxx()
        提供一个显示对象信息的show()

    Alt + Insert 快捷生成构造函数，Get Set 方法
 */
public class D01Student {
    // 成员变量
    private String name;
    private  int age;

    // 构造方法
    public D01Student() {
    }

    public D01Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
