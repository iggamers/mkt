package com.code.base.method;

/*
    带参数方法的定义和调用

    定义格式：
        public static void 方法名(参数) { … … }

	调用格式：
        方法名(参数);
 */
public class D02MethodWithParameters {
    public static void main(String[] args) {
        // 常量值的调用
        isEvenNumber(10);

        // 变量的调用
        int number = 10;
        isEvenNumber(number);
        System.out.println("--------");

        change(number); // num的值不会改变
        System.out.println(number);
        System.out.println("--------");

        int arr[] = {1,2,3};
        for (int i :arr){
            System.out.println(i);
        }
        System.out.println("--------");

        change(arr);
        for (int i :arr){
            System.out.println(i);
        }
    }

    // 需求：定义一个方法，该方法接收一个参数，判断该数据是否是偶数
    public static void isEvenNumber(int number) {
        if(number%2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    //  对于基本数据类型的参数，形式参数的改变，不影响实际参数的值
    public static void change(int number) {
        number = 200;
    }

    // 对于引用类型的参数，形式参数的改变，影响实际参数的值
    public static void change(int[] arr) {
        arr[1] = 200;
    }
}
