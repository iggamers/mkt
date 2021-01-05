package com.code.base.array;

public class D04ArrayTraversal {
    public static void main(String[] args) {
        // 定义数组
        int[] arr = {11, 22, 33, 44, 55};

        // 使用通用的遍历格式
        for(int x=0; x<arr.length; x++) {
            System.out.println(arr[x]);
        }

        // 增强for遍历
        for(int x : arr){
            System.out.println(x);
        }
    }
}
