package com.code.base.method;

/*
    方法：是将具有独立功能的代码块组织成为一个整体，使其具有特殊功能的代码集

    定义格式：
        public static void 方法名 ( ) {
	        //方法体
	    }

	调用格式：
	    方法名();

    方法注意事项：
        方法不能嵌套定义
        void表示无返回值，可以省略return，也可以单独的书写return，后面不加数据

 */
public class D01Method {
    public static void main(String[] args) {
        //调用方法
        isEvenNumber();
    }

    //需求：定义一个方法，在方法中定义一个变量，判断该数据是否是偶数
    public static  void isEvenNumber() {
        //定义变量
        int number = 10;
        number = 9;

        //判断该数据是否是偶数
        if(number%2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}