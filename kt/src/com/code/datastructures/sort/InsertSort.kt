package com.code.datastructures.sort

import kotlin.system.measureTimeMillis


fun main() {
	// 测试一下冒泡排序的速度O(n^2), 给80000个数据，测试
	// 创建要给80000个的随机的数组
	var arr = IntArray(80000)
	for (i in 0 until 80000){
		arr[i] = (0..800000).random()
	}
	val elapsedTime = measureTimeMillis {
		insertSort(arr)
	}
	println("total time :$elapsedTime")
	
	println("-----------")
	arr = arrayOf(101, 34, 119, 1).toIntArray()
	println("排序前：")
	println(arr.contentToString())
	insertSort(arr)
	println("排序后：")
	println(arr.contentToString())
	
	println("-----------")

	insertSortEvolutionProcess()
}

fun insertSort(arr: IntArray) {
	var insertVal: Int = 0
	var insertIndex: Int = 0
	for(i in 1 until  arr.size ){
		// 定义待插入的数
		insertVal = arr[i]
		// 即 arr[i]前面这个数的求下表
		insertIndex = i -1
		
		// 给insertVal 找到插入的位置
		// 说明
		// 1. insertIndex >= 0 保证在给insertVal 找插入位置，不越界
		// 2. insertVal < arr[insertIndex] 待插入的数，还没有找到插入位置
		// 3. 就需要将 arr[insertIndex] 后移
		while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
			arr[insertIndex + 1] = arr[insertIndex];// arr[insertIndex]
			insertIndex--;
		}
		// 当退出while循环时，说明插入的位置找到, insertIndex + 1
		// 举例：理解不了，我们一会 debug
		//这里我们判断是否需要赋值
		if(insertIndex + 1 != i) {
			arr[insertIndex + 1] = insertVal;
		}
	}
}

// 使用逐步推导的方式来讲解，便利理解
fun insertSortEvolutionProcess() {
	var arr = arrayOf(101, 34, 119, 1).toIntArray()
	println("排序前：")
	println(arr.contentToString())
	
	// 第1轮 {101, 34, 119, 1};  => {34, 101, 119, 1}
	
	// 定义待插入的数
	var insertVal: Int = arr[1]
	// 定义待插入的位置索引 即arr[1]的前面这个数的下标
	var insertIndex: Int = 1 - 1
	
	// 给insertVal 找到插入的位置
	// 说明
	// 1.insertIndex >= 0保证insertVal 插入的位置不越界
	// 2.insertVal < arr[insertIndex] 插入的数，还没有找到插入位置
	// 3.就需要将 arr[insertIndex]后移
	while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
		arr[insertIndex + 1] = arr[insertIndex];// arr[insertIndex]
		insertIndex--;
	}
	//当退出while循环时，说明插入的位置找到, insertIndex + 1
	//举例：理解不了，我们一会 debug
	arr[insertIndex + 1] = insertVal;
	
	print("第1轮插入:");
	println(arr.contentToString())
	
	
	//第2轮
	insertVal = arr[2];
	insertIndex = 2 - 1;
	
	while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
		arr[insertIndex + 1] = arr[insertIndex];// arr[insertIndex]
		insertIndex--;
	}
	
	arr[insertIndex + 1] = insertVal;
	print("第2轮插入:");
	println(arr.contentToString())
	
	//第3轮
	insertVal = arr[3];
	insertIndex = 3 - 1;
	
	while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
		arr[insertIndex + 1] = arr[insertIndex];// arr[insertIndex]
		insertIndex--;
	}
	
	arr[insertIndex + 1] = insertVal;
	print("第3轮插入:");
	println(arr.contentToString())
}