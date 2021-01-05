package com.code.base.loop;
/*
	for语句

    格式：
        for(初始化语句;条件判断语句;条件控制语句) {
			循环体语句;
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

public class D01For {
    public static void main(String[] args) {
        // 需求：在控制台输出5次"HelloWorld"
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("--------");

        // 用循环改进
        for(int i=1; i<=5; i++) {
            System.out.println("HelloWorld");
        }
    }

    // 求水仙花数
    public static  void narcissusNum(){
        // 输出所有的水仙花数必然要使用到循环，遍历所有的三位数，三位数从100开始，到999结束
        for(int i=100; i<1000; i++) {
            // 在计算之前获取三位数中每个位上的值
            int ge = i%10;
            int shi = i/10%10;
            int bai = i/10/10%10;

            // 判定条件是将三位数中的每个数值取出来，计算立方和后与原始数字比较是否相等
            if(ge*ge*ge + shi*shi*shi + bai*bai*bai == i) {
                //输出满足条件的数字就是水仙花数
                System.out.println(i);
            }
        }
    }

    // 求和 1-5之间的数据和
    public static void sum(){
        // 求和的最终结果必须保存起来，需要定义一个变量，用于保存求和的结果，初始值为0
        int sum = 0;

        //从1开始到5结束的数据，使用循环结构完成
        for(int i=1; i<=5; i++) {
            // 将反复进行的事情写入循环结构内部，此处反复进行的事情是将数据 i 加到用于保存最终求和的变量 sum 中
            sum += i;
			/*
				sum += i;	sum = sum + i;
				第一次：sum = sum + i = 0 + 1 = 1;
				第二次：sum = sum + i = 1 + 2 = 3;
				第三次：sum = sum + i = 3 + 3 = 6;
				第四次：sum = sum + i = 6 + 4 = 10;
				第五次：sum = sum + i = 10 + 5 = 15;
			*/
        }

        // 当循环执行完毕时，将最终数据打印出来
        System.out.println("1-5之间的数据和是：" + sum);
    }
}
