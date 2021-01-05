package com.code.base.loop;

/*
	while语句

    基本格式：
        while(条件判断语句) {
			循环体语句;
		}

	完整格式：
		初始化语句;
		while(条件判断语句) {
			循环体语句;
			条件控制语句;
		}

    执行流程：
        1:执行初始化语句
		2:执行条件判断语句，看其结果是true还是false
            如果是false，循环结束
            如果是true，继续执行
		3:执行循环体语句
		4:执行条件控制语句
		5:回到2继续
 */
public class D02While {
    public static void main(String[] args) {
        // 需求：在控制台输出5次"HelloWorld"
        // for循环实现
        for (int i = 1; i <= 5; i++) {
            System.out.println("HelloWorld");
        }
        System.out.println("--------");

        // while循环实现
        int j = 1;
        while (j <= 5) {
            System.out.println("HelloWorld");
            j++;
        }

    }

    /*
        珠穆朗玛峰

        需求：
            世界最高山峰是珠穆朗玛峰(8844.43米=8844430毫米)，假如我
	*/
    public static void whileTest() {
        // 定义一个计数器，初始值为0
        int count = 0;

        // 定义纸张厚度
        double paper = 0.1;

        // 定义珠穆朗玛峰的高度
        int zf = 8844430;

        // 因为要反复折叠，所以要使用循环，但是不知道折叠多少次，这种情况下更适合使用while循环
        // 折叠的过程中当纸张厚度大于珠峰就停止了，因此继续执行的要求是纸张厚度小于珠峰高度
        while (paper <= zf) {
            // 循环的执行过程中每次纸张折叠，纸张的厚度要加倍
            paper *= 2;

            // 在循环中执行累加，对应折叠了多少次
            count++;
        }

        // 打印计数器的值
        System.out.println("需要折叠：" + count + "次");
    }
}
